(ns gittp.pages
  (:require [hiccup.core :refer :all]))

(def ^:const site-title "gittp")

(defn- full-title [title]
  (str title " — " site-title))

(defn- html-wrapper [title & content]
  (html
    [:html
     [:head
      [:title (full-title title)]]
     [:body
      content]]))

(defn home []
    (html-wrapper
      "home"
      [:h1 site-title]
      [:p "TODO"]))                                        ; TODO(fjah): add content

(defn not-found []
  (let [title "not found"]
    (html-wrapper
      title
      [:h1 title]
      [:p "404 — this page couldn't be found."])))
