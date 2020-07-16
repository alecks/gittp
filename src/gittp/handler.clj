(ns gittp.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [gittp.pages :as pages]))

(defroutes app-routes
           (GET "/" [] (pages/home))
           (route/not-found (pages/not-found)))

(def app
  (wrap-defaults app-routes site-defaults))
