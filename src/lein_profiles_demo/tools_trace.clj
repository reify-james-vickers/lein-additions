(ns lein-profiles-demo.tools-trace)

(defn square [x] (* x x))

(defn add [a b] (+ a b))

(comment
  (trace (* 2 3))
   ;; To trace a value

  (trace "tag" (* 2 3))
   ;; To trace a value and assign a trace tag

  (deftrace fubar [x v] (+ x v))
   ;; To trace a function call and its return value
  (fubar 2 3)


  (do (+ 1 3) (* 5 6) (/ 1 0)) ; error, division by 0

  ;; To identify which form is failing
  (trace-forms (+ 1 3) (* 5 6) (/ 1 0))

  ; dynamically trace/untrace all fns in a name space
  (trace-ns lein-profiles-demo.tools-trace)
  (untrace-ns lein-profiles-demo.tools-trace)
  (add 2 3)

  ; dynamically trace/untrace specific fns
  (square 5)
  (trace-vars lein-profiles-demo.tools-trace/square)
  (untrace-vars lein-profiles-demo.tools-trace/square))