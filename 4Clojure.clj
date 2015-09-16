;;Collection of 4Clojure.com problems

;;Problem #156
(fn [x y] (apply hash-map (interleave y (repeat x))))

;;Problem #157
(fn [x] (map reverse (map-indexed vector x)))