# Address Book

A Java Spring Boot web application for managing contacts through a simple browser-based interface. The project demonstrates a basic MVC structure using Spring Boot and Thymeleaf, with an in-memory service layer for contact data.

## Features

- View all contacts
- Add a new contact
- Update an existing contact
- Delete a contact
- Store contact details including first name, last name, email, and phone number

## Technologies

- Java
- Spring Boot 3.3.2
- Spring MVC
- Thymeleaf
- Maven
- HTML

## Project Structure

- `model/Contact.java` — contact data model
- `service/ContactService.java` — in-memory contact management and CRUD logic
- `controller/ContactController.java` — routes and application flow
- `templates/contacts.html` — contact-list view
- `templates/contact-form.html` — add/update form

## Run Locally

Requirements: Java and Maven.

```bash
mvn spring-boot:run
```

Then open `http://localhost:8080/` in your browser.

## Screenshots

The repository includes screenshots demonstrating the contact list and add, update, and delete workflows.

## Note

Contact data is stored in memory for this version of the project, so changes reset when the application restarts.
