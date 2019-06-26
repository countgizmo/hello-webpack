(ns hello-webpack.core
  (:require [react]))


(defn dummy-fn []
  "hotdogs!")


(defn react-component []
  (.log js/console react/Component) 
  "hardcoded string")

(react-component)
