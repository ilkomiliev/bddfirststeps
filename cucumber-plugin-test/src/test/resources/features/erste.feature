#language: de
Funktionalität: Kalendar

  Szenariogrundriss: Schaltjahr markieren
    Angenommen wir haben <Jahr> ausgewählt
    Wenn das Jahr ein Schaltjahr ist
    Dann muss es in <Schaltjahrfarbe> angezeigt werden.

    Beispiele: 
      | Jahr | Schaltjahrfarbe |
      | 1600 | true            |
      | 1800 | false           |
      | 2015 | false           |
      | 2016 | true            |
