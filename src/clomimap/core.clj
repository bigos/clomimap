(ns clomimap.core
  (:use [clojure.pprint :only [cl-format]]
            seesaw.core
            seesaw.chooser
            seesaw.color
            seesaw.dev      ;if you comment it out you can use (show-options)
            seesaw.graphics
            )
  (:gen-class))


;; ; This first handler uses raw Java2D calls to do painting. See (paint2) below
;; ; for an example of using Seesaw's simple shape support.
;; (defn paint1 [c g]
;;   (let [w (.getWidth c)
;;         h (.getHeight c)]
;;     (doto g
;;       (draw (polygon [0 h] [(/ w 4) 0] [(/ w 2) (/ h 2)] [w (/ h 2)] [0 h])
;;                      (style :foreground java.awt.Color/BLACK
;;                        :background (color 128 128 128 128)
;;                        :stroke     (stroke :width 4)))
;;       (.setColor (color 224 224 0 128))
;;       (.fillRect 0 0 (/ w 2) (/ h 2))
;;       (.setColor (color 0 224 224 128))
;;       (.fillRect 0 (/ h 2) (/ w 2) (/ h 2))
;;       (.setColor (color 224 0 224 128))
;;       (.fillRect (/ w 2) 0 (/ w 2) (/ h 2))
;;       (.setColor (color 224 0 0 128))
;;       (.fillRect (/ w 2) (/ h 2) (/ w 2) (/ h 2))
;;       (.setColor (color 0 0 0))
;;       (.drawString "Hello. This is a canvas example" 20 20))))

;; (def text-style (style :foreground (color 0 0 0)
;;                        :font "ARIAL-BOLD-24"))

;; (def star
;;   (path []
;;     (move-to 0 20) (line-to 5 5)
;;     (line-to 20 0) (line-to 5 -5)
;;     (line-to 0 -20) (line-to -5 -5)
;;     (line-to -20 0) (line-to -5 5)
;;     (line-to 0 20)))

;; (defn paint2 [c g]
;;   (let [w (.getWidth c)  w2 (/ w 2)
;;         h (.getHeight c) h2 (/ h 2)]
;;     (draw g
;;       (ellipse 0  0  w2 h2) (style :background (color 224 224 0 128))
;;       (ellipse 0  h2 w2 h2) (style :background (color 0 224 224 128))
;;       (ellipse w2 0  w2 h2) (style :background (color 224 0 224 128))
;;       (ellipse w2 h2 w2 h2) (style :background (color 224 0 0 128)))
;;     (push g
;;       (rotate g 20)
;;       (draw g (string-shape 20 20  "Hello. This is a canvas example") text-style))
;;     (push g
;;       (translate g w2 h2)
;;       (draw g star (style :foreground java.awt.Color/BLACK :background java.awt.Color/YELLOW)))))

;; ; Create an action that swaps the paint handler for the canvas.
;; ; Note that we can use (config!) to set the :paint handler just like
;; ; properties on other widgets.
;; (defn switch-paint-action [n paint]
;;   (action :name n
;;           :handler #(-> (to-frame %)
;;                       (select [:#canvas])
;;                       (config! :paint paint))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
