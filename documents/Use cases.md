## USE CASE TABEL

| Nr | Activity                        | Guest  | User | Admin | 
|----|---------------------------------|--------|------|-------| 
| 1 | Oprette bruger| x | | |
| 2 | Log ind | | x | x |
| 3 | Se liste over oprettede quizzes | | | x |
| 4 | Oprette ny quiz med indhold | | | x |
| 5 | Slette quiz | | | x |
| 6 | Se profil | | x | |
| 7 | Vælge fag | | x | |
| 8 | Starte en quiz | | x | |
| 9 | Svare på quiz spørgsmål | | x | |
| 10 | Se samlet score på quiz | | x |  |
| 11 | Log ud | | x | x |






Use case 1 - Opret bruger:
- Beskrivelse:
  - Aktøren	kan	oprette	en bruger for	at	få	adgang	til	programmet som bruger	
- Forudsætninger:
  - Programmet skal køre
- Uddybende beskrivelse:
  1. Fra log-ind-siden, vælges “Opret	bruger”	knappen.
  2. Man omstilles til opret-bruger-siden, hvor man kan udfylde brugeroplysninger i tekstfelterne:
      - brugernavn
      - kode
  3. Klik	på	“Opret	bruger” knappen, og brugeren vil blive oprettet (kodeord vil blive hashet). 
      - Hvis brugernavnet ikke er ledigt eller begge felter ikke er udfyldt, vil aktøren blive henvist til  opret-bruger-siden igen, og får mulighed for at udfylde felterne igen.
  4. Efter oprettelse af bruger, vil aktøren blive viderestillet til programmets log-ind-side	
- Supplerende oplysninger:
  - Brugeren	bliver	ikke	automatisk	logget	ind	ved	oprettelse af	bruger.	For	at logge ind i programmet,	skal	use	case	2	udføres.	

Use case 2 - Log ind:
- Beskrivelse: 
  - Aktøren	skal	logge	ind	for	at	bruge	programmet (uanset om man er bruger eller administrator).	
- Forudsætninger:
  - Aktøren	skal	have et	gyldigt	brugernavn	samt	kode.
- Uddybende beskrivelse:
  1. Udfyld brugernavn	og	kode	i	tekstfelterne	på	programmets	log-ind-side.
  . Tryk på "Log	ind" knappen.	
  3. Brugeren valideres.
      - Ved ugyldigt brugernavn og kodeord, vil vi få en fejlmeddelelse. 
  4. Programmet	 viser menu med udgangspunkt i om man er bruger eller administrator.
- Supplerende oplysninger:
  - Hvis man ikke har en bruger i forvejen, henvises	det	til	use	case	1,	hvor	man	kan	oprette	en	bruger.		

Use case 3 - Se liste over oprettede quizzes:
- Beskrivelse: 
  - Aktøren skal kunne se en liste over de quiz der ligger indenfor et specifikt fag. 
- Forudsætninger:
  - Indlogget som administrator 
- Uddybende beskrivelse:
  1. I fagmenuen trykker man på respektive fag 
  2. En liste over quiz der er oprettet i systemet fremvises. 
- Supplerende oplysninger:
  - Fra den use case kan man gå videre til use case 4 og 5. 

Use case 4 - Oprette ny quiz med indhold:
- Beskrivelse: 
  - Administrator kan oprette en Quiz inden for sit fag
- Forudsætninger: 
  - indlogget som administrator
- Uddybende beskrivelse:
  1. Fra administrator-menuen vælges opret Quiz
  2. Administrator oprettet spørgsmål, med svar muligheder
  3. Administrator angiver korrrekt svar blandt svar mulighederne 
  4. Administrator offentliggøre Quizzen
- Supplerende oplysninger:
  - Fra denne use case kan man gå videre til use case 5 og 8 

Use case 5 - Slette quiz:
- Beskrivelse: 
- Forudsætninger:
- Uddybende beskrivelse:
- Supplerende oplysninger:


Use case 6 - Se profil:
- Beskrivelse: 
  -	Brugeren kan se sin egen brugeroplysninger (profil)
- Forudsætninger:
  -	Programmet skal køre
  -	Brugeren skal være logget ind
- Uddybende beskrivelse:
  -	Efter aktøren er logget ind, skal brugeren vælge ”min profil” knappen.
  -	Brugeren omstilles til sin egen profilside, hvor der er mulighed for se diverse oplysninger (brugernavn, password og gennemførte    quizzes m.m.) om brugeren
- Supplerende oplysninger:
  -	Man skal have en bruger i programmet før man kan se sin profil. Hvis man ikke har en bruger henvises der til use case 1.

Use case 7 - Vælge fag:
- Beskrivelse: Brugeren skal kunne vælge et fag blandt en liste med forskellige fag.
- Forudsætninger: Programmet skal køre, samt brugeren skal være logget ind.
- Uddybende beskrivelse: Faget skal vælges fra en form for menu/liste vi opretter.
- Supplerende oplysninger: Admin skal have oprettet faget for at en bruger er i stand til at vælge det senere hen.

Use case 8 - Starte en quiz: 
- Beskrivelse: Brugeren kan starte en Quiz og teste sin forståelse i et fag. 

- Forudsætninger: Programmet skal køre

-	Uddybende beskrivelse:

1.Fra ”bruger-menuen”, vælges et fag via ”fag-knapperne” som er udstillet på den pågældende klientside 
på det pågældende fag’s menu, vælges nu en quiz 

2.Quizzen påbegyndes via en ”Start Quiz” knap.

3.Når quizzen er slut, altså når brugeren er kommet igennem alle spørgsmål, udregner systemet en ”score”, som viser brugeren hvor mange rigtige besvarelser. 

- Supplerende oplysninger:
Admin skal have oprettet en quiz til faget, før man kan ”starte” en quiz
Hvis man ikke har en bruger i forvejen, henvises	det	til	use	case	1,	hvor	man	kan	oprette	en	bruger.


Use case 9 - Svare på quiz spørgsmål:
- Beskrivelse: 
- Forudsætninger:
- Uddybende beskrivelse:
- Supplerende oplysninger:

Use case 10 - Se samlet score på quiz:
- Beskrivelse: 
- Forudsætninger:
- Uddybende beskrivelse:
- Supplerende oplysninger:

Use case 11 - Log ud:
•	Beskrivelse:
o	Aktøren har mulighed for at logge ud. 
•	Forudsætninger:
o	Aktøren er allerede logget ind.
•	Uddybende beskrivelse:
i.	Brugeren trykker på ”Log ud” knappen.
ii.	Brugen logges af systemet.
iii.	Programmet viser Use case 1 og 2.
•	Supplerende oplysninger:
o	Det er ikke muligt at fortryde en ”log ud”. Herefter skal der logges ind igen. 


