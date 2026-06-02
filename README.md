

Hello,

this is a learning project I've built as I'm learning React JS, setting up frontend and the communication between it and backend.

So it's a nice and simple app to learn and practice the most common 150 German verbs/+their prefixes and their meaning, + an example sentence.

for example for the verb Gehen, you will see a list of versb like angehen, vorgehen, nachgehen, mitgehen... and their meaning + an example sentence for each of them respectively. I will upload an image that shows how it looks.

for the technical part:

	-Frontend 	: React JS
	-Backend	: Spring Boot (JDK 17)
	-DB		: PostgreSQL


Very simple project, although you need the tables inside the databse well set up for it work, using those steps i guess:

	1. Have PostgreSQL.
	
	2. Using PostgreSQL, create a database with a name that matches whatever is in the dw_backend (Spring Boot) application.properties file + PostgreSQL username and password.
	
	3. Run the Spring Boot app once, it will create the tables in the databse with the right columns.
	
	4. then run the 2 queries (1 query for each table respectively), the queries include the table names so it's easy to tell. The two queries are in the text file called DB_Query, remember there's TWO inside of it.
	
	5. you have ready-for-use DB.
	
	

After that you just run the project and i think it should work, if it doesn't, check : 

	-Versions 
	-Ports
	-URL
	-Libraries?

ALSO you can add more words and adjust-edit it and make it bigger and add more words to the database, but you will have to change the limits in Word_Table.jsx in React as I've set the limit for 150, so for example you made it 500 words:
(Use the same format) you just change whatever 150 you saw there in that file to 500. Done!
	
if you run it locally it should show up on http://localhost:5173/

I'm learning how to deploy it, so you wouldn't need to run it locally and just get to practice (I'm making this app for my personal learning, but if it helps you, that's good), also I'm writing this readme.md because why not.



	
kind regards,
kxz