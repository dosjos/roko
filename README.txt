Lag testklasse til hver eneste klasse (ikke api klasser)

SQL tester bør kjøres på en test database ikke på selve PersonLog databasen.

Implementer og test full funksjonalitet for både FileHandler klassen og database klassen.
Tanker er at man skal kunne kjøre Fil klassen dersom databasen ike fungerer en dag.

Da må det også implementeres en funksjon som kan skjekke om det ligger filer i strukturen med info som ikke er i databasen
da den endelig kommer opp igjen.

Lage en funksjon for backup av databasen, som bær kjøres automatisk en gang i uken.

Lage en statistikk modul som skal kunne printe ut statestikk på besøkende, denne kommer senere men bør
inneholde 3parts pakker for fancy grafikk

Implementere Maven og javabeans

Enekl info om alle kidsa må skrives til en fil uansett. Men da holder det med fornavn og etternavn, kansje telefon nummer.
Dette er for at registrering skal funke selv om databasen er nede
