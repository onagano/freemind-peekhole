(ns fmtest.control-point
  (:import [freemind.extensions HookRegistration]
           [freemind.modes MindMap ModeController])
  (:gen-class
   :name plugins.control.ControlPoint
   :implements [freemind.extensions.HookRegistration]
   :init init
   :constructors {[freemind.modes.ModeController freemind.modes.MindMap] []}))

(def controller
  (atom nil))

(def mind-map
  (atom nil))

(defn -init
  [c m]
  (println "\n*** init called")
  (swap! controller (fn [_] c))
  (swap! mind-map (fn [_] m))
  [[] nil])

(defn -register
  [this]
  (println "*** register called")
  nil)

(defn -deRegister
  [this]
  (println "*** deRegister called")
  nil)
