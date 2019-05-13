(def simakanta
  [{:aines "Vesi", :yksikko "litraa", :maara 4}
  {:aines "Sokeri", :yksikko "grammaa", :maara 500}
  {:aines "Sitruuna", :yksikko "kpl", :maara 2}
  {:aines "Hiiva", :yksikko "grammaa", :maara 1}])

(def newrecipe (fn [luku2](map #(update % :maara * luku2) simakanta)))

(println (newrecipe 3))
(println (newrecipe 2))
(println (newrecipe 10))