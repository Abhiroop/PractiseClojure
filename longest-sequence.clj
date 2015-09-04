(defn max-2-seq 
  "returns the sequence of max length between 2 sequences"
  [seq1 seq2] 
  (if(> (count seq1) (count seq2))
        seq1
        seq2))

(defn longest-sequence
  "returns the sequence of max length from a sequence of sequence" 
  [a-seq] (reduce max-2-seq a-seq))