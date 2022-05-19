(ns lein-profiles-demo.stuff-test
  (:require [clojure.test :refer :all]
            [lein-profiles-demo.stuff :refer :all]))

(deftest a-test
  (is (= 25 (square 5)))
  (is (= 4 (square 2))))
