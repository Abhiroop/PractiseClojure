(defn tail-recursive-fibo [n]
  "tail recursive fibonacci number generation with TCO"
  (letfn [(fib
            [current next n]
            (if (zero? n)
              current
              (recur next (+ current next) (dec n))))]
    (fib 0N 1N n)))