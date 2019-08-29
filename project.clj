(defproject com.works/async-sockets "0.2.0"
  :description "A Clojure library for working with sockets using core.async channels."
  :url "https://github.com/bguthrie/async-sockets"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/tools.logging "0.3.1"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [clj-time "0.8.0"]]
                   :global-vars {*warn-on-reflection* true}}})
