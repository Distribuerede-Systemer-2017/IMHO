## Hent IMHO repository
1. Åbn din terminal / git bash og naviger hen til mappen hvor du ønsker dette projekt skal ligge. Anvend `cd` til at skifte mappe. 
2. `git clone https://github.com/Distribuerede-Systemer-2017/IMHO.git`
3. Åbn IntelliJ, lav et nyt projekt og placer projektet oven i dette repository
4. Højreklik på `pom.xml` og tryk "Add as Maven Project".

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