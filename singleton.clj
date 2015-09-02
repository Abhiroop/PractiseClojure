(defn singleton? 
  "Check if a collection contains a single element"
  [coll] (empty? (rest coll)))
