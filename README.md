# Capstone-Project
Capstone Project for Leo Hu
The goal of the project is to create a platform where users can see the details of organizations in school
The project will be done using Spring Java as the framework in combination with Thymeleaf to implement a MVC structure
Basic Workflow:
1. Users will be able to create their own Organization page, where details such as meeting dates, descriptions, size, recruiting condition, executive member contacts, etc. will be displayed
2. Other users will be able to search & see the organizations


Update Log

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
