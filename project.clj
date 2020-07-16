(defproject gittp "0.1.0-SNAPSHOT"
  :description "A REST git client"
  :url "https://fjah.github.io/gittp"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [hiccup "1.0.5"]
                 [clj-jgit "1.0.0-beta3"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler gittp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
