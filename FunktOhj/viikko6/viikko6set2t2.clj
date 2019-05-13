;; a) Esitä, kuinka tuotat apply-funktiota käyttäen seq:n, jossa on kunkin osavektorin minimiarvo.
;; b) Esitä vielä, kuinka saat seq:n muutetuksi vektoriksi, joka sisältää alkioinaan nämä luvut, käyttäen pelkästään apply- ja vector-funktioita.

(def vektor [[1 2 3][4 5 6][7 8 9]])

;; Teht a
(defn minimi
  [vektori]
  (map #(apply min %) vektori))

;; Teht b
(def minimivektor
  (vec (minimi vektor)))

(minimi vektor)