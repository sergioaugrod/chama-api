(ns chama-api.pib-test
  (:require [clojure.test :refer :all]
            [chama-api.pib :refer :all]
            [clj-http.client :as client]
            [clojure.data.json :as json]))

(def pib-fixture (slurp "test/fixtures/pib.json"))
(def pib-fixture-parsed (json/read-str pib-fixture))

(deftest call-test
  (with-redefs [client/get (fn [url] {:body pib-fixture})]
    (is (= pib-fixture-parsed (call)))))
