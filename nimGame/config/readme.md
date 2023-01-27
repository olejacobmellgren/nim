# Config

Denne mappen inneholder definert format for checkstyles og en liste med spotbugs som skal ignoreres. Det er skrevet mer detaljerte beskrivelser av verktøyene under.

## Checkstyle

Checkstyle har blitt implementert for å sjekke kodekvaliteten. Dette verktøyet skal sjekke at Java-koden som har blitt skrevet følger vanlig kodestandard. Checkstyle er lagt inn som "plugin" for maven i pom.xml, der Checkstyle bruker versjon 9.0. Både Checkstyle og Spotbugs sier ifra om feil når man kjører `mvn install` eller `mvn verify`. Vi valgte å bruke google_checks.xml som mal for vår egen checkstyle og ga denne noen hensiktsmessige modifikasjoner. Endringene som ble gjort er:

- Error istedenfor warning
  - Forklaring på valg: Ved å endre til at checkstyle violations gir error vil man ikke kunne kjøre `mvn install` eller `mvn verify` uten at alle checkstyles er fikset.
    I tillegg vil man få et totalt antall checkstyles i terminalen, i motsetning til hvis man bruker warnings
- Innhopp på 4 mellomrom
  - Forklaring på valg: google_checks.xml sin standard er at et innhopp på 2 mellomrom skal brukes. Siden hele gruppen bruker et innhopp på 4, endret vi dette i filen
- Pakkenavn følger et annet mønster
  - Forklaring på valg: Pakkenavnene våre slik de er nå fører til checkstyle violations. Det er ikke tillat med stor bokstav i et pakkenavn med google_checks.xml. I steden for å endre på pakkenavnene våre endret vi på mønsteret som er tillat slik at checkstyle violations ikke dukker opp for dette

## Spotbugs

Slik som Checkstyle er også Spotbugs implementert for å sjekke kodekvaliteten. Spotbugs ser etter feil (bugs) i koden og er også lagt inn som "plugin" for maven i ytterste pom-fil. Spotbugs bruker versjon 4.7.2.