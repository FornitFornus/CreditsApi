# CreditsApi

Stworzenie aplikacji w architekturze rozproszonej. Aplikacja powinna składać się z następujących komponentów:

- Komponent bazodanowy zawierający tabele do składowania danych.
- Komponenty z usługami napisanymi w SpringBoot

## Opis aplikacji:
Aplikacja służy do składowania oraz pobierania informacji o kredycie klienckim.

## Przypadki użycia:
- UC01: Złożenie informacji o kredycie
- UC02: Pobranie informacji o kredycie

# Uruchomienie

docker-compose -f docker-compose.yml up

- end-pointy: 
- http://localhost:9090/credits
- http://localhost:8080/showForGui
