(ns chama-api.calculate-test
  (:require [clojure.test :refer :all]
            [chama-api.calculate :refer :all]
            [clj-http.client :as client]
            [clojure.data.json :as json]))

(def pib-fixture (slurp "test/fixtures/pib.json"))
(def pib-fixture-parsed (json/read-str pib-fixture))

(deftest total-test
  (is (= 1823241001000 (total pib-fixture-parsed))))
