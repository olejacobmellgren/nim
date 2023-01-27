# Nim - Eget prosjekt

Nim er et spill som jeg her har implementert i Java ved hjelp av JavaFX. Prosjektet er laget av eget initiativ og er ikke et prosjekt i forbindelse med min utdanning på NTNU.

# Beskrivelse

Nim er et spill for to spillere. Spillet består av fire rader med ulikt antall fyrstikker (1, 3, 5, 7). Spillere vil etter tur trekke et ønsket antall fyrstikker fra en rad om gangen, og spilleren som må trekke den siste fyrstikken har tapt.

Slik jeg har lagd spillet skal man først skrive inn navnet til de to spillerne før spillet kan starte. Deretter trykker man på start-knappen og det vil stå hvem som skal starte. Denne personen velger et antall fyrstikker fra en rad og trykker ferdig, slik det blir den andre personen sin tur. Det er mulighet for å starte spillet på nytt med restart-knappen.

## Bygging og kjøring med maven

Prosjektet er konfigurert til å bygge med maven. Ved å kjøre `mvn install` i **nimGame** vil man forberede prosjektet for å kunne kjøre. Man kan kjøre applikasjonen ved å navigere til **nimGame/ui** og kjøre `mvn javafx:run`, eller kjøre `mvn javafx:run -f ui/pom.xml` direkte i **nimGame**.

## Testing

Prosjektet har foreløpig ingen tester men vil kunne kjøres ved `mvn test` i **nimGame**.