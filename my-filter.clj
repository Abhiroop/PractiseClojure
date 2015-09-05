(defn predfun [pred? x]
  "returns element if predicate is satisfied"
  (if (pred? x)
     x))

(defn filtered [pred? a-seq]
  (if (empty? a-seq)
    a-seq
    (cons (predfun pred? (first a-seq))
          (lazy-seq (my-filter pred? (rest a-seq))))))

(defn my-filter 
  "filters a sequence which doesnt satisfy the predicate"
  [pred? a-seq] 
  (remove nil? (filtered pred? a-seq)))