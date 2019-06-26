(ns hello-webpack.core-test
  (:require [hello-webpack.core :as sut]
            [cljs.test :as t :include-macros true]))


(t/deftest dummy-test
  (t/is (= "hotdogs!" (sut/dummy-fn))))


(t/deftest react-component-not-nil
  (t/is (not (nil? (sut/react-component)))))
