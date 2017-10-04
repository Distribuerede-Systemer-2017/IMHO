# IMHO
Gruppe IMHO - Eksamensquiz

KRAVSPECIFIKATION 

BESKRIVELSE: 

Applikationen skal fungere som eksamenstræning for de studerende på ha(it). Rent praktisk skal en administrator (forelæser) oprette pensum relaterede quizzes. Alle brugerne skal kunne tilgå quizzes og forsøge at besvare dem, få resultaterne udskrevet, samt tilføje kommentarer. 
					
SERVER: 	
- Serveren skal kunne validere login baseret på et hashet password.
- Serveren skal kunne oprette og opdatere en bruger.
- Serveren skal udstille et API, som gør det nemt at udarbejde klienter der kan trække på serverens funktionalitet. API’et skal dække følgende funktionaliteter:
	- En gæst skal kunne oprette sig som bruger
	- En bruger skal kunne logge ind/ud
	- En bruger skal kunne tilgå en quiz under et respektivt fag
	- En bruger skal kunne kommenterer på quiz, samt slette selvsamme kommentar 
	- En admin skal derudover kunne slette alles kommentarer på quiz
	- En admin skal kunne oprette en quiz
	- En admin skal kunne opdatere en quiz (tilføje spørgsmål, redigere spørgsmål og slette spørgsmål)
	- En admin skal kunne slette en quiz
- Serveren skal håndtere en funktion, som gør det muligt at oprette en ny quiz

KLIENT:
- Klienten skal kunne tilgå loginsiden samt logge ind.  
- Klienten skal kunne oprette sig som bruger samt slette brugeren. 
- Klienten skal kunne tilføje quiz til de respektive fag samt svar. 
- Klienten skal kunne opdatere en quiz
- Klienten skal kunne slette quizzen
- Klienten skal kunne tilgå diverse fag. 
- Klienten skal kunne tilgå quiz relateret til det specifikke fag
- Klienten skal kunne vælge quizzen samt tage den. 
- Klienten skal modtage feedback ud fra klientens svar. 
- Klienten skal kunne tilføje kommentar på quizzen
- Klienten skal kunne slette selvsamme kommentar. 
- Klienten skal ud fra brugertype se forskellige menuer. 

IDEER TIL VIDEREUDVIKLING: 
- Gemme resultater samt se statistik. 
- Glemt password
- Admin godkende brugere 
- Slette/blokere spørgsmål - hvordan?		
- Brugere skal kunne oprette spørgsmål
- Server skal kunne slette brugere
