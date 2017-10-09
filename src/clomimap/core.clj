(ns clomimap.core
  (:require [seesaw.core :as sc]))

(defn -main [& args]
  (-> (sc/frame :title "Hello" :content "Hi there") sc/pack! sc/show!))
