(ns chama-api.pib
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

; http://dados.gov.br/dataset/produto-interno-bruto-pib/resource/4ba110d1-47e2-4ecd-9840-50e8ea4e92f0
(def resource "http://api.pgi.gov.br/api/1/serie/1873.json")

(defn- parse
  [resource]
  (->
    resource
    :body
    (json/read-str)))

(defn call
  []
  (->>
    resource
    client/get
    parse))
