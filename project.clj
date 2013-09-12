(defproject la4j-example "0.0.1"
  :description "Usage example of la4j-example, especially SVD"
  :url "https://github.com/syou6162/la4j-example"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.la4j/la4j "0.4.0"]]
  :global-vars {*warn-on-reflection* true}
  :main la4j-example.core)
