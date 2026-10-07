(ns walletapp.core
  (:require
   [ring.adapter.jetty :as jetty]
   [walletapp.infra.handler :as handler]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (jetty/run-jetty handler/app {:port 3000}))
