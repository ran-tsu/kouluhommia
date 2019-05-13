;; Teht 1

(println "Anna luku, joka on suurempi kuin 0")
(let [luku (read-line)]
  (if (<= (Integer. luku) 0) "Virhe!" 
  (if (= (rem (Integer. luku) 2) 0) "Antamasi luku on parillinen" "Antamasi luku on pariton")))


;; Teht 2

(println "Anna luku, joka on suurempi kuin 0")
(let [luku (read-line)]
(loop [(Integer. luku) 0] 
  (println ((Integer. luku))
    (if (<= (Integer. luku) 0) "test" (recur (luku))))))


;; Teht 3

(println "Anna luku")
(let [luku (read-line)]
  (loop [i 0]
    (println i)
    (if (>= i (Integer. luku))
      (println "Fin")
      (recur (+ i 3)))))
	  

;; Teht 4

(defn rln []
  (inc (rand-int 39)))

(defn rand-lottorivi []
  (println "Lottorivisi on:")
  (loop [lottorivi #{}]
    (if (= (count lottorivi) 7)
      lottorivi
      (recur (conj lottorivi (rln))))))
(rand-lottorivi)


;; Teht 5

(defn yhttek [p q]
  (println (str "arvot " q " " p))
  (if (= q 0)
    (println (str "Suurin yhteinen tekijä on:  " p ))
    (if (= (/ q p) 0) 
      " " (recur q (- p 1))
    )))
(yhttek 102 68)
(yhttek 15 25)