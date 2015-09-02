(defn sum
  "count all characters in a sequence without using count" 
  [coll] (reduce + (map (fn [x] 1) coll)))