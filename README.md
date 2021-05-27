# kotlin-playground

hiermit können wir weiter machen https://levelup.gitconnected.com/automated-deployment-using-docker-github-actions-and-webhooks-54018fc12e32



# Server-Einrichtung
- Ingress-Freigaben für Server eingerichtet (8080, 9000)
- unter ~/webhook die Dateien webhook.json (Definition der Hook) und redeploy.sh (holen, stoppen und starten des Containers) angelegt
- webhook installiert
- Zugriff auf Spring-App (im Container gestartet, Port 8080) funktioniert von extern und intern
- Zugriff auf Webhook (Port 9000) funktioniert nur lokal via localhost, nicht von extern --> hier nächstes mal weiter
