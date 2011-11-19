(ns touchballs.core
  (:use [rosado.processing]
        [rosado.processing.applet]))


(defn draw
  "Example usage of with-translation and with-rotation."
  []
  (background-float 125)
  (stroke-float 10)
  (fill-float (rand-int 125) (rand-int 125) (rand-int 125))
  (with-translation [(/ 200 2) (/ 200 2)]
    (with-rotation [QUARTER_PI]
      (begin-shape)
      (vertex -50  50)
      (vertex  50  50)
      (vertex  50 -50)
      (vertex -50 -50)
      (end-shape CLOSE)))
  (filter-kind INVERT))

(defn setup []
  "Runs once."
  (smooth)
  (no-stroke)
  (fill 226)
  (framerate 10))


(defapplet touchballs.core :title "An example."
  :setup setup :draw draw :size [200 200])

(run touchballs.core)
