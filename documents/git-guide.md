## Commit
Git commit bruges for at gemme et "stage" i kodingen. På denne måde kan man gå tilbage til dette "stage" hvis der er noget der går dårligt og en skal gå tilbage til en trin hvor en ved at koden fungerer. 
Et commit bliver kun gemt lokalt på din computer hvis den ikke pushes op i repositoriet. 
For at lave et commit følges følgende steps: 
  1. Åbn terminal og tilgå den mappe der skal commites (vha. "cd mappanavn") 
  2. Skriv i terminalen "git status" for at se om der er nogle filer der ikke er gemt/commited --> Hvis der er filer markeret i rød (ved default layout på terminal), skal der fortsettes. 
  3. Skriv i terminalen "git add .". Dette kommando betyr git add all og velger simpelten alle filerne der blev fremvist i forige step. 
  4. Skriv i terminalen " git commit -m"besked til commitet fx. ændingerne der er blevet gjort" ". 
  5. Skriv i terminalen "git status" for at tjekket at alle filer er commited. Som svar i terminalen bør du nå få en besked ala "nothing to commit" eller "up to date". 

  
## Push til repository 
Vi pusher til repository for at dele commitene vi har lavet lokalt på vores computer. (Der skal ikke pushes noget til master branch uden tilladelse!!)
How to: 
  1. Fullfør steps for commit som beskrevet ovenfor. 
  2. Skriv i terminalen "git checkout branchnavn" for at tjeke at du arbejder på rigtig branch (ikke master). Som svar i terminalen bør du få en besked der siger at du allerede arbejder på respektive branch. 
  3. I terminalen "git push" - som svar bør der komme en bekreftelse på at det er blevet pushet til repository, evt. med link til hvorhen (ala "github.com/Distribuerende-systemer-2017/IMHO/....."). 

Kommer der fejlmeldelelser kan der måske være fordi en skal udføre et "pull" før push. Dette kan gjøres ved følgende: 
  1. "git pull" i terminalen. 
  2. "git push" i terminalen (se step 3 ovenover) 

Kommer der igen fejlmedelser kan man forsøge at skrive "git push origin branchnavn" i terminalen og her forvente samme output som i ovenstående step 3. 
 
  
