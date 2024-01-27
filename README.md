# ACCOUNT MANAGEMENT SYSTEM
## Developed by Group Five(5) for First Academy 2.0 Software Engineering Track - SringBoot End Of Course Project

## Table of Contents
* [Project Essence](#project-essence)
* [Description](#description)
* [Dashboard Screenshot](screenshots)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Setup Instruction](#setup-instruction)
* [Usage](#usage)
* [Features](#features)
* [Collaborators](#collaborators)
* [Contributing](#contributing)
* [Licenses](#license)
* [Acknowledgment](#acknowledgments)
* [Resources](#resources)

## Project Essence
This project was developed as part of the First Academy Software Engineering Track, specifically for the End of Spring Boot Course. It was prepared by Group 5, comprising six(6) members showcasing their skills and understanding of building a unique account management system using the Spring Boot framework and MySQL database. The system aims to provide a secure and user-friendly platform for managing user accounts with essential functionalities such as account creation, view dashboard, edit, and delete account management. 

## Description
This is an Account Management System built with the Spring Boot framework and uses a MySQL database for data storage. This Account Management System provides basic functionalities for managing user accounts, including registration, and profile management with view, edit, and delete functionality. The system is designed to be user-friendly and secure, offering a seamless experience for users interacting with their accounts.

## Prerequisites
Make sure you have the following installed on your machine before setting up the application:
* IDE(IntelliJ preferred)
* Java Development Kit (JDK) version 17 or higher
* Apache Maven
* MySQL Database Server

## Screenshots
<div style="display: flex; justify-content: center;">
    <img src="/src/main/resources/static/assets/img/index_page.png" alt="index" style="width: 400px; height: 300px; margin-right: 10px;">
    <img src="/src/main/resources/static/assets/img/create_account.png" alt="create_page" style="width: 400px; height: 300px; margin-right: 10px;">
    <img src="/src/main/resources/static/assets/img/dashboard.png" alt="dashboard" style="width: 400px; height: 300px; margin-right: 10px;">  
    <img src="/src/main/resources/static/assets/img/team.png" alt="team" style="width: 400px; height: 300px; margin-right: 10px;">  
</div>

## Installation
#### Setup Instruction
Follow these steps to set up and run the Account Management System:

#### 1. Clone the Repository
Clone the repository to your local machine using the following command:
```
git clone https://github.com/lordlughas/account-management-system.git
```
#### 2. Configure MySQL Database
Create a MySQL database and update the application.properties file with your database configuration. Open the src/main/resources/application.properties file and modify the following properties:

```
spring.datasource.url=jdbc:mysql://localhost:3306/{your_database_name}
spring.datasource.username={your_database_username}
spring.datasource.password={your_database_password}
```

#### 3. Build the Project
Navigate to the project's root directory and build the application using Maven:
```
cd account-management-system
mvn clean install
```

#### 4. Run the Application
Run the application using the following command:
```
java -jar target/account-management-system.jar
```
Alternatively:
Click the Run button of the IDE(IntelliJ)
The application will start, and you can access it at http://localhost:8080 in your web browser.

#### 5. Access the Application
Open your web browser and go to http://localhost:8080 to access the Account Management System.

## Usage
- Create an account: Create a new account by providing the required information like your name, and account type(savings, checking, domiciliary, current etc).
- Profile Management: You can edit your account, and delete your account.
- View Dashboard: You can view the dashboard of accounts available. See the top accounts, while also having a chat to show the type of accounts available.

  
## Features
- Dashboard View: See the list of accounts available. View the different accounts available for savings type, checking, domiciliary, current, etc.
- Authentication and Validation of Account: Authenticate the creation of an account if it exists or is being created below a specific amount.


## Collaborators
1. Charles .I. Lughas
- GitHub: [lordlughas](https://github.com/lordlughas)
- Email: charleslughas@gmail.com

2. Folarin .M. Aluko
- GitHub: [Prominence](https://github.com/prominence)
- Email: folamart163@gmail.com

3. Nasiru .M. Ibrahim
- GitHub: [nasir](https://github.com/nasir)
- Email: nasir.moh.ibrahim@gmail.com

4. Ezekiel .E. Jackson
- GitHub: [unrulee](https://github.com/unrulee)
- Email: jackson.ezekiel.st@gmail.com

5. Faith .O. Samson
- GitHub: [Moongenevieve](https://github.com/Moongenevieve)
- Email: fsamson5@gmail.com

6. Idowu .J. Adeyink
- GitHub: [Idowu](https://github.com/idowu007)
- Email: adeyinkaidowu007@gmail.com

#### Contributing
If you'd like to contribute to the project, please follow our [contribution guidelines](https://github.com/lordlughas).

## License
This project is licensed under the MIT License

## Acknowledgments
We sincerely appreciate our facilitator, Mr Azeez Saliu, for his tutelage and experience in guiding us through this springboot course. With him, learning this springboot course was worth every moment. In addition, we thank the entire [Elev8](https://elev8.com) for giving us this platform under FirstAcademy.

## Resources
- [springboot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Elev8 springboot material](https://elev8.com)
