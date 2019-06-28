(ns hello-webpack.core
  (:require [react]
            [sentry]))


(defn dummy-fn []
  "hotdogs!")


(defn react-component []
  (.log js/console react/Component)
  "hardcoded string")

(.log js/console sentry)
(react-component)
