(ns fmtest.core
  (:use [clojure.repl]
        [clojure.java.javadoc]
        [fmtest.control-point :only [controller mind-map]])
  (:import [freemind.main FreeMindStarter]
           [freemind.modes.mindmapmode MindMapController]))

(defn fm-launch
  "Bring the FreeMind frame as it ordinary does."
  []
  (FreeMindStarter/main (into-array String [])))

(defn fm-quit
  "Dispose the frame. Need more consideration about unsaved change,
   gracefully tearing down of plugins, etc."
  []
  (.. @controller getFrame dispose))

(defn fm-exit
  "This will call System.exit(), be careful."
  []
  (let [jfrm (.getFrame @controller)
        qact (. (.getController jfrm) quit)
        evnt (java.awt.event.ActionEvent. jfrm, 0, "quit")]
    (.actionPerformed qact evnt)))
