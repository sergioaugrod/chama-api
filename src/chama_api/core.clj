(ns chama-api.core
  (:require [chama-api.pib :as pib]
            [chama-api.calculate :as calculate])
  (:gen-class))

(defn -main
  [& args]
  (->>
    (pib/call)
    (calculate/total)
    (println)))
