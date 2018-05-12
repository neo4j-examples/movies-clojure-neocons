(defproject neocons-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.1"]
                 [clojurewerkz/neocons "3.2.0"]
                 [ring/ring-json "0.4.0"]]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler neocons-example.handler/app}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring/ring-mock "0.3.2"]]}})
