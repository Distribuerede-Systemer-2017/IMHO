# IMHO
Gruppe IMHO - Eksamensquiz

KRAVSPECIFIKATION 

BESKRIVELSE: 

Applikationen skal fungere som eksamenstræning for de studerende på ha(it). Rent praktisk skal en administrator (forelæser) oprette pensum relaterede multiple choice quizzes. Alle brugerne skal kunne tilgå quizzes og forsøge at besvare dem, få resultatet udskrevet.
					
SERVER: 	
- Serveren skal kunne validere login baseret på et hashet password.
- Serveren skal udstille et API, som gør det nemt at udarbejde klienter der kan trække på serverens funktionalitet. API’et skal dække følgende funktionaliteter:
	- En gæst skal kunne oprette sig som bruger med hashet password
	- En bruger og en admin skal kunne logge ind/ud
	- En bruger skal kunne se sin profil 
	- En bruger skal kunne tilgå en quiz under et respektivt fag
	- En bruger skal kunne se samlet score udfra brugerens svar på quiz.
	- En bruger skal kunne se de rigtige svar på de enkelte spørgsmål efter quizzen er taget.
	- En admin skal kunne oprette en quiz
	- En admin skal kunne slette en quiz
	- En admin skal kunne se en oversigt over oprettede quizzes 

KLIENT:
- Klienten skal kunne tilgå loginsiden samt logge ind.  
- Klienten skal kunne oprette sig som bruger
- Klienten skal kunne tilføje quiz til de respektive fag samt svar. 
- Klienten skal kunne slette quizzen
- Klienten skal vise en oversigt over alle oprettede quizzes 
- Klient skal kunne vise brugeroplysninger 
- Klienten skal kunne tilgå quiz relateret til det specifikke fag
- Klienten skal vise samlet score udfra brugerens svar.
- Klienten skal ud fra brugertype gæst/admin/bruger se forskellige menuer. 

IDEER TIL VIDEREUDVIKLING: 
- Gemme resultater samt se statistik. 
- Glemt password
- Admin godkende brugere 
- Slette/blokere spørgsmål - hvordan?		
- Brugere skal kunne oprette spørgsmål
- java.server skal kunne slette brugere
- Kommentarer til quiz
- En admin skal kunne opdatere en quiz (tilføje spørgsmål, redigere spørgsmål og slette spørgsmål)


KLASSER:
- scr
	- main
		- ResponseHandler
		- java.server
		- java.server.controller
			- "Funktionalitet"
			- DB-wrapper
		- Database
			- UserTable
			- TopicTable
			- QuizTable
			- QuestionTable
		- View
			- Endpoint1
			- Endpoint2
			- Endpoint3
		- java.server.models
			- User
			- Topic
			- Quiz
			- Question
		- Utility
			- Digester

