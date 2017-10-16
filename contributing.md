## Hent IMHO repository
1. Åbn din terminal / git bash og naviger hen til mappen hvor du ønsker dette projekt skal ligge. Anvend `cd` til at skifte mappe. 
2. `git clone https://github.com/Distribuerede-Systemer-2017/IMHO.git`
3. Åbn IntelliJ, lav et nyt projekt og placer projektet oven i dette repository
4. Højreklik på `pom.xml` og tryk "Add as Maven Project".

### Nulstil database
1. Før funktionen kan køres, skal i have MySQL installeret på jeres computer. 
2. I ResetDatabase-klassen på linje 24, 25 og 26 kan I se at System.getenv(...) bliver kaldt og forventer at finde en variabel. Da disse ikke er sat på forhånd I jeres projekt, skal disse konfigureres inden systemet kan køre.
3. Klik på "ResetDatabase" konfigurationen ved den grønne play-knap øverst til højre
4. Klik "Edit Configurations ..."
5. Klik på "..." yderste til højre ved "Environment Variables"
6. Klik på "+" nederst til venstre
7. Opret og navngiv nu følgende variable og indsæt de værdier som passer til dit system: 
```
DATABASE_HOST (default er localhost)
DATABASE_NAME (quizDB)
DATABASE_PORT (default er 3306)
DATABASE_USER (dit lokale brugernavn)
DATABASE_PASSWORD (dit lokale password)
```

8. Tryk OK og OK
9. Kør programmet igen

Hvis alt virker som det skal, så printes en masse tekst i konsollen og du kan nu åbne din databse og se hvilke tabeller
samt værdier der er blevet indsat. 

## Git Branch
Det er dårlig kodeskik at kode i `master-branch`, da den ses som det "endelige produkt". Lav derfor egen branch. 
1. I terminalen / git bash skriv da `git branch branchname`. 
2. For at navigere til denne branch skriv da `git checkout branchname`

## Commit og push
Husk hele tiden at gemme det du laver, når du koder. Hellere for mange commits end for få. 
1. I terminalen / git bash, vær sikker på, at du befinder dig i mappen. Anvend `git status` for at se hvilke filer der er ændret.
2. Vær sikker på, at du er up to date - kan udføres ved at pulle versionen på Git. Skriv da `git pull`
3. Skriv `git add .` 
4. Til sidst, commit det du har kodet. `git commit -m"kommentar"`
5. For at pushe op til GitHub skrives `git push`

## HUSK
- Hellere for mange commits end for få
- Aldrig merge uden en ansvarlig har godkendt koden
- Husk beskrivende commits - for din egen skyld også
