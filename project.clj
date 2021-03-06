(defproject idea-board "0.1.0"
  :description "Idea Board"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [camel-snake-kebab "0.1.4"]
                 [cheshire "5.3.1"]
                 [hiccup "1.0.5"]
                 [korma "0.3.2"]
                 [mysql/mysql-connector-java "5.1.31"]
                 [ring "1.3.1"]
                 [ring/ring-json "0.3.1"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]]

  :profiles {:dev {:dependencies [[speclj "3.1.0"]
                                  [ring/ring-devel "1.2.2"]]
                   :main "idea-board.core"}}
  :plugins [[speclj "3.1.0"]]
  :test-paths ["spec"])
