;; Teht 4

(defn square [x]
  (* x x)
)
(square 2)
(square 7)

;; Teht 5

(fn karkausvuosi? [vuosi]
  (if (= 0 (mod vuosi 100))
      (= 0 (mod vuosi 400))
      (= 0 (mod vuosi 4))))

(karkausvuosi? 100)
(karkausvuosi? 200)
(karkausvuosi? 400)
(karkausvuosi? 12)
(karkausvuosi? 20)
(karkausvuosi? 15)
