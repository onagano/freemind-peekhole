(ns fmtest.shell
  (:use [clojure.repl]
        [fmtest.control-point :only [controller mind-map]])
  (:import [freemind.main FreeMindStarter]
           [freemind.modes.mindmapmode MindMapController]))

(defn fm-launch
  []
  (FreeMindStarter/main (into-array String [])))

;; (defn fm-quit
;;   []
;;   (let [jfrm (.getFrame @controller)
;;         qact (. (.getController jfrm) quit)
;;         evnt (java.awt.event.ActionEvent. jfrm, 0, "quit")]
;;     (.actionPerformed qact evnt)))
