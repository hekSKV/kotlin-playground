# kotlin-playground

## Doing fürs nächste Mal
- Webhook absichern mit Secret --> Anpassung Action
- Webhook als Deamon starten


Diese Anleitung haben wir durch gemacht: https://levelup.gitconnected.com/automated-deployment-using-docker-github-actions-and-webhooks-54018fc12e32
GitH
## Server-Einrichtung
- Ingress-Freigaben für Server eingerichtet (8080, 9000)
- unter ~/webhook die Dateien webhook.json (Definition der Hook) und redeploy.sh (holen, stoppen und starten des Containers) angelegt
- webhook installiert
- Zugriff auf Spring-App (im Container gestartet, Port 8080) funktioniert von extern und intern
- Zugriff auf Webhook (Port 9000) funktioniert erst, wenn folgende Befehle ausgeführt werden. Diese werden genötigt, damit iptables Zugriff auf den Port zulässt (Docker macht dies bei der Installation auch)
- Zum Testen selbstsigniertes Zertifikat erstellt (https://dzone.com/articles/create-a-self-signed-ssl-certificate-using-openssl) und in GitHub "insecure" eingetragen.

``` bash
sudo iptables -I INPUT 6 -m state --state NEW -p tcp --dport 9000 -j ACCEPT
sudo netfilter-persistent save
```

## Bedienung
- mit redeploy.sh wird Container gestartet
- Webhook starten mit `` sudo webhook -secure -hooks /home/ubuntu/webhook/hooks.json -cert /home/ubuntu/webhook/server.crt -key /home/ubuntu/webhook/server.key -verbose``
- Aufruf Anwendung: ``152.70.175.84:8080/hellos``
- Redeploy: ``152.70.175.84:9000/hooks/redeploy``
