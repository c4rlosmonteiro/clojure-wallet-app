(ns walletapp.infra.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [api-defaults wrap-defaults]]))

(defroutes app-routes
  "Application routes"
  (GET "/" [] {:status 200 :headers {"Content-Type" "application/json"} :body {:msg "Hello World"}})
  (GET "/hello-world" [] {:status 200 :headers {"Content-Type" "application/json"} :body {:msg "Hello World"}})
  (route/not-found "404"))

(def app
  (-> app-routes
      (wrap-defaults api-defaults)))