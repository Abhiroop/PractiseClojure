(defn singleton? 
  "Check if a collection contains a single element"
  [coll] (empty? (rest coll)))

(defn my-last 
  "emits the last element of a sequence"
  [coll] (if (singleton? coll) 
     (nth coll 0) 
     (my-last (rest coll))))