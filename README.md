# Capstone-Project
Capstone Project for Leo Hu
The goal of the project is to create a platform where users can see the details of organizations in school
The project will be done using Spring Java as the framework in combination with Thymeleaf to implement a MVC structure

How To Use:
Open with IntelliJ:
  1. Within applicatin.property, change the database settings to your own (need to be mySQL)
  2. Run the application as how you will run a normal spring application (Note: on each run, the application will reset the database)
  3. schema.sql will create tables in the database automatically
  4. data.sql will fill in two default rows of users: demoUser and demoAdmin, both could be used to sign in with password 123456

Overview Structure of the Application:

  Open to All:
  /
    1. Home Page
    2. Display all clubs in the "clubs" table in the database
    
  /users/create
    1. Register a user here

  Open to Users:
  /users/myProfile
    1. Display the username & email of the current logged in user

  /clubs/create
    1. Record a club

  /logout
    1. Log out

  Open to Admin:
  /admin
    1. Admin home page (no function implemented yet)

  /admin/allUsers
    1. Show a list of all usernames, passwords & roles.

Update Log

04282021
1. Added frontend views with HTML + Thymeleaf + BootStrap4
2. Added global navigation bars (able to reach all pages by GUI)
3. Styled most of the pages

04042021
1. Added password encoder configuration (BCryptPasswordEncoder)
2. Created a new Class "UserRegistration", which is responsible for validating form input (separated it from the database model "User")

03282021
1. Added login (plain password) by jdbc authentication
2. replace automatic generation of entity table with manual generation by schema.sql

03202021
1. Added user creation validation

03182021:
1. Added user Entity
2. Added user creation form
