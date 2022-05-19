(ns lein-profiles-demo.inspector
  (:require [clojure.inspector :refer [inspect inspect-tree inspect-table]]))

; https://practical.li/clojure-staging/clojure-tools/data-browsers/clojure-inspector.html

(defn mock-data-set
  "Generates a set of mock data for each name
  Arguments: names as strings, names used in keys
  Returns: Sequence of maps, each representing confirmed cases"
  [& locations]
  (for [location locations
        day      (range 20)]
    {:day      day
     :location location
     :cases    (+ (Math/pow (* day (count location)) 0.8)
                  (rand-int (count location)))}))

(comment
  (inspect
    (repeatedly 1000 #(rand-int 101)))
  
  (inspect-tree
   {:starwars
    {:characters
     {:jedi ["obiwan kenobi" "Yoda" "Master Wendoo"]
      :sith ["Palpatine" "Count Dukoo"]}}})
  
  (inspect-table
   (mock-data-set "England" "Scotland" "Wales" "Northern Ireland")))
