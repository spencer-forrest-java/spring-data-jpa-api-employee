#  Employee REST API

The user can perform CRUD operations through this REST API.

#### Technologies used

1. Maven
2. Spring Boot
3. Spring Web MVC
3. Spring Data JPA
3. JSON
6. MySQL
7. JDBC


### Description

The user can perform CRUD operations on an 
<a href="src/main/java/com/spencer/forrest/employeerestapi/entity/Employee.java">
employee
</a> entity using HTTP methods:
1. POST "/api/employees" to create a new employee 
2. GET "/api/employees" to retrieve a list of all employees
3. GET "/api/employees/{employeeId}" to retrieve a specific employee using his id
4. PUT "/api/employees/" to update an employee
5. DELETE "/api/employees/{employeeId}" to delete an employee using his id

### JSON format

JSON representation of the 
<a href="src/main/java/com/spencer/forrest/employeerestapi/entity/Employee.java">
employee
</a> entity
```
{
    "id": 99,
    "firstName": "John",
    "lastName": "Clayton",
    "email": "jhon@email.com"
}
```

### Software Architecture

There are 3 layers:
1. <a href="src/main/java/com/spencer/forrest/employeerestapi/controller">Controller</a>
2. <a href="src/main/java/com/spencer/forrest/employeerestapi/service">Service</a>
3. <a href="src/main/java/com/spencer/forrest/employeerestapi/repository">JPA Repository</a>

### Spring Data JPA

Use of 
<a href="src/main/java/com/spencer/forrest/employeerestapi/repository/EmployeeRepository.java">
EmployeeRepository
</a> interface that extends the 'JpaRepository' interface.<br/>
This interface enables CRUD operations on the entity 
<a href="src/main/java/com/spencer/forrest/employeerestapi/entity/Employee.java">
Employee
</a> which has an integer as 'id'.

### Configuration

The configuration file is <a href="src/main/java/resources/application.properties">application.properties</a>.

### Database

The file <a href="sql/employee.sql">employee.sql<a/> is a script to create an employee table and insert sample data.



