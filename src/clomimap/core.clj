(ns clomimap.core
  (:use [clojure.pprint :only [cl-format]]
   seesaw.chooser
   seesaw.color
   seesaw.core
   seesaw.dev                      ;if you comment it out you can use (show-options)
   seesaw.graphics)

  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
