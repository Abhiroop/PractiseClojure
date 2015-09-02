(defn max-element 
  "emits the maximum element in a sequence"
  [coll]
  (cond
    (empty? coll) nil
    (= (count coll) 1) (first coll)
    :else (max (first coll) (max-element (rest coll)))))