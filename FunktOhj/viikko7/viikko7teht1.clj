(defn prompt-rows
  []
  (println "How many rows? [5]")
  (let [rows (Integer. (get-input 5))
        board (new-board rows)]
  (if (>= rows 5)
      (prompt-empty-peg board)
      (recur))))
