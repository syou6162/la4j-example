(ns la4j-example.core)

(import org.la4j.matrix.sparse.CRSMatrix
        org.la4j.factory.CRSFactory
        org.la4j.decomposition.SingularValueDecompositor)

(defn -main [& args]
  ;; http://elsur.jpn.org/reading_notes/Greenacre1984.pdf
  (let [svd (org.la4j.decomposition.SingularValueDecompositor.)
        crs (CRSFactory.)
        matrix (. crs createMatrix 4 3)]
    (doto matrix
      (. set 0 0 1)
      (. set 0 1 2)
      (. set 0 2 3)

      (. set 1 0 6)
      (. set 1 1 4)
      (. set 1 2 5)

      (. set 2 0 8)
      (. set 2 1 9)
      (. set 2 2 7)

      (. set 3 0 10)
      (. set 3 1 11)
      (. set 3 2 12))
    (doseq [m (. svd decompose matrix crs)]
      (println m))))
