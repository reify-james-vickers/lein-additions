(ns lein-profiles-demo.debux)

; debux library
(comment

  ; basic usage of dbg, only shows the final result
  (dbg (+ 1 2 (* 3 4)))

  ; dbgn shows every subexpression
  (dbgn (+ 1 2 (* 3 4) (/ 5.0 6.0)))

  ; can also use reader macros, same result and sometimes more convenient
  #d/dbgn (+ 1 2 (* 3 4) (/ 5.0 6.0))

  #d/dbgn
   (let [x 1
         y (inc x)
         z (* x y)]
     (+ x y z))

  ; can put on function definitions which traces every call to the function
  #d/dbgn
   (defn sum-squares [coll]
     (->> coll
          (map #(* % %))
          (reduce +)))
  (sum-squares (range 5))
  (sum-squares (range 10))

  ; dbgn on a thread-first macro shows every intermediate result
  #d/dbgn
   (-> {:name "Socrates", :age 39}
       :name
       (.toUpperCase)
       (.concat "!"))

  ; dbgn on a thread-last macro shows every intermediate result
  #d/dbgn
   (->> (range 10)
        (filter odd?)
        (map #(* % %))
        (reduce +))

  ; dbg and dbgn can be used as a stage in threading macros to just show that part
  (->> (range 10)
       (filter odd?)
       dbgn
       (map #(* % %))
       (reduce +))

  ; dbgn on some->, some->>
  #d/dbgn
   (some-> {:a 1} :b inc)

  #d/dbgn
   (some-> {:a 1} :a inc)

  #d/dbgn
   (some->> {:y 3 :x 5}
            (:y)
            (- 2))

  #d/dbgn
   (some->> {:y 3 :x 5}
            (:z)
            (- 2))

  ; dbgn on as->
  #d/dbgn
   (as-> [:foo :bar] v
     (map name v)
     (first v)
     (.substring v 1))

  ; dbgn on cond-> and cond->>
  #d/dbgn
   (cond-> 1
     true inc
     false (* 42)
     (= 2 2) (* 3))

  #d/dbgn
   (cond->> (range 10)
     true (filter odd?)
     false (filter even?)
     (.contains (.toLowerCase (System/getProperty "os.name")) "mac") (map inc))

  ; dbgn on comp
  ((dbg (comp - inc inc #(* % % %) +)) 5)

  ; dbgn on '..'
  (dbgn (.. "fooBAR"
            toLowerCase
            (replace "foo" "")
            (contains "bar")))

  ; dbgn on doto
  #d/dbgn
   (doto (java.time.Instant/now)
     (.minusSeconds 5)
     (.toEpochMilli))

  ; dbgn on recur
  #d/dbgn
   (defn factorial [num]
     (loop [acc 1 n num]
       (if (zero? n)
         acc
         (recur (* acc n) (dec n)))))
  (factorial 5)

  ; dbgt for transducers
  (transduce
   (dbgt (comp (map inc) (filter odd?)))
   conj
   (range 5)))
