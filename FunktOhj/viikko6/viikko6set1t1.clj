;;'(-20 -22 -15 -2 10 15 20 20 15 10 10 5)
;;'(-22 -23 -16 -2 11 14 16 17 14 11 11 4)
;;(filter pos? '(-20 -22 -15 -2 10 15 20 20 15 10 10 5 -22 -23 -16 -2 11 14 16 17 14 11 11 4))

(def sum #(reduce + %))
(def avg #(float(/ (sum %) (count %))))

(defn tempavg
  [numbers]
  (map #(% (filter pos? numbers)) [avg]))

(println (str "Vuosien 2015 ja 2016 positiivisten kuukausittaisten keskileskilämpötilojen keskiarvo: "))
(tempavg [-20 -22 -15 -2 10 15 20 20 15 10 10 5 -22 -23 -16 -2 11 14 16 17 14 11 11 4])
