(ns clomimap.core
  (:require [seesaw.core :as sc]))

(defn -main [& args]

  (let [f (sc/frame :content (sc/label :text "Hello World!"))]
    (sc/pack! f)
    (sc/show! f)))
