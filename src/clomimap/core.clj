(ns clomimap.core
  (:use seesaw.core
   seesaw.graphics
   seesaw.color
   seesaw.dev                      ;if you comment it out you can use (show-options)
   seesaw.chooser
   [clojure.pprint :only [cl-format]])

  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
