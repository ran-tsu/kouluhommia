(defn addStyle[style name] (str style name))

(def muod (partial addStyle "Terveisin "))

(def epamuod (partial addStyle "Se o moro, "))

(def engmuod (partial addStyle "Best regards, "))

(def engepamuod (partial addStyle "Eat my shorts, "))

(muod "Nön Nönnönnöö")
(epamuod "Matti Meikäläinen")
(engmuod "John Doe")
(engepamuod "Bart Simpson")