# GreenRide – Testwoche

Stand nach **Contract**: `findeFahrrad` liefert `Optional`, `findeFahrraederNachModell` eine Liste.
Paket `org.alo.greenride`. Gemeinsamer Startpunkt fuer alle in der Testwoche (Edge Case, Red, Green).

## Starten

- `KassenApp` – die Rueckgabe an der Kasse
- `GreenRideApp` – die Stationsuebersicht aus dem Mini-Projekt
- `beispiel.KinoApp` – Beispiel: eine Methode lehnt einen Aufruf ab (Merkkarte Unittest, Seite 1)
- `beispiel.KinokasseTest` – Beispiel: Unittests (Merkkarte Unittest, Seite 2). Start: Rechtsklick auf die Datei → *Run*

## Klassen

| Klasse | Aufgabe |
|---|---|
| `Station` | Verleihstation, kennt ihre Fahrraeder |
| `Fahrrad` | ein Rad, kennt seine Station und seine Wartungen |
| `Wartung` | eine Wartung an einem Rad (entsteht nur ueber `Fahrrad`) |
| `GreenRideApp` | Stationsuebersicht |
| `KassenApp` | Rueckgabe an der Kasse |
| `beispiel.Playlist`, `beispiel.Song`, `beispiel.PlaylistApp` | Beispiel aus Contract: Suche mit `Optional` |
| `beispiel.Kinokasse`, `beispiel.KinoApp`, `beispiel.KinokasseTest` | Beispiel aus der Testwoche: Ablehnen mit `throw`, Unittests |
