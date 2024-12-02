Grocery Store Management System
This is a web-based application for managing a grocery store, built using Java Spring Boot and Thymeleaf. It provides functionality for user registration, login, and role-based access control, allowing different levels of access for customers and admins. The system is designed for efficient management of products and users, with an intuitive interface and support for English and French.

Features
User Registration and Login: Users can sign up, log in, and access their respective dashboards.
Role-Based Access Control (RBAC):
Admin: Manages users and products, accesses the admin dashboard, and performs CRUD operations on products.
Customer: Views available products and accesses the customer dashboard.
Multi-Language Support: Supports English and French, with localization files (messages_en.properties and messages_fr.properties).
Product Management: Admins can add, update, delete, and view products.
Sorting and Filtering: Sort users based on specific columns and display sorting order using up/down arrows in the UI.
Email Notifications: User registration confirmations and other notifications sent via Gmail SMTP.
Technologies Used
Backend: Java Spring Boot, Spring Security (for RBAC)
Frontend: Thymeleaf (HTML templates), JavaScript
Database: MySQL
Dependencies:
Spring Boot Starter Data JPA
Spring Security
Thymeleaf and Thymeleaf Extras for Spring Security 6
Lombok
Spring Boot DevTools for hot reload
Gmail SMTP for email services
Installation and Setup
Clone the Repository:

bash
Copy code
git clone https://github.com/ishimwedivin/grocery-store.git
cd grocery-store
Configure Database:

Update application.properties with your MySQL database connection details.
Example:
properties
Copy code


Ensure you have Java and Maven installed.
Run the following commands:
bash
Copy code
mvn clean install
mvn spring-boot:run
Access the Application:

Open your browser and go to http://localhost:8080.
Folder Structure
src/main/java/com/yourproject/grocery - Main project source code.
Controller: Manages request handling.
Service: Contains business logic.
Repository: Interfaces for database operations.
Model: Entity classes representing database tables (e.g., User, Product).
src/main/resources/templates - Thymeleaf HTML templates for views.
src/main/resources/messages_en.properties - English language properties file.
src/main/resources/messages_fr.properties - French language properties file.
Endpoints
User Management:
/register - User registration
/login - User login
/admin - Admin dashboard
/admin/upload - Product upload (Admin only)
Product Management:
/products - View products
/admin/products - CRUD operations on products (Admin only)
API Integration (Optional)
Purpose: Enables API integrations without Spring Security, as specified.
Instructions: To add APIs, configure routes in the controller and define business logic in services.
Customization
Changing Language: Add new .properties files for additional languages and update the templates to use language keys.
Updating Sorting Logic: Modify the Thymeleaf templates and sorting parameters to reflect the desired sorting logic.
Security and Authentication
Password Encryption: Uses BCryptPasswordEncoder to encrypt user passwords.
RBAC: Uses Spring Security to restrict access based on roles.
Contributing
Fork the repository.
Create a feature branch (git checkout -b feature/YourFeature).
Commit your changes (git commit -m 'Add some feature').
Push to the branch (git push origin feature/YourFeature).
Open a Pull Request.