(ns chama-api.calculate)

(defn- get-values
  [resource]
  (let [values (resource "valores")]
    (->>
      values
      (map #(%1 "valor")))))

(defn total
  [resource]
  (->>
    (get-values resource)
    (reduce +)))
