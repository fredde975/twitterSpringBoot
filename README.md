# twitterSpringBoot

Url för att köra tjänsten: http://127.0.0.1:8080/sortedTweets?twitterTag=yolo

Tjänsten är satt till att högst läsa in 500 tweets. Ut från tjänsten returneras en lista (högst 100 ord) med populäraste
orden, sorterat i fallande popularitetsordning.

Jag har inte satt upp någon Swaggerdokumentation i Amazon Gateway än. Följande felkoder kan man få tillbaka:

422     Inte rätt information i queryparametern eller queryparametern saknas
500     Om ett TwitterException fångats i koden. Kan vara olika orsaker.
509     Alla tillgängliga anrop till twitter är slut


http://127.0.0.1:8080/sortedTweets?tag=metoo