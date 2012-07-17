(defproject fmtest "0.1.0-SNAPSHOT"
  :description "FreeMind plugin to get a reference to it."
  :url "https://github.com/onagano/freemind-peekhole"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :resource-paths ["resources"
                   ;; "/Applications/FreeMind.app/Contents/Resources/Java/lib/freemind.jar"
                   ;; "/Applications/FreeMind.app/Contents/Resources/Java"
                   "/Users/onagano/work/fm/freemind-bin-max-0.9.0/lib/freemind.jar"]
  :aot [fmtest.control-point]
  :repl-init fmtest.core)
