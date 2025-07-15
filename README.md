#  🛠️ Complaint_Register_System

A simple yet effective Java-based Complaint Management System project designed to help users register, view, update, and delete complaints.
Complaint Management System is a simple Java-based console application built with Hibernate, PostgreSQL, and Maven, designed to handle user complaints through basic CRUD operations. 
**idea** behind this project is taking complaint online will help user for privacy and they can feel free to express their issues.
It features a layered architecture using the DAO pattern, allowing users to register, view, update, and delete complaints. Ideal for learning Java back-end development with Hibernate and relational database integration, the project runs in VS Code and connects seamlessly to a PostgreSQL database.
This project utilizes **Hibernate** for ORM, **PostgreSQL** for the database, and is managed using **Maven** in **VS Code**.  i tried to write clean code by using DAO and POJO 

# 📌 Features
- Menu driven programe
- take input from user
- store data provide by user
- Use Hybernet JPA
- has POJO class so get and set data
- user can delete,update,insert and view data
- data safety


# 📌 What project provide

- 📝 Register new complaints
- 📋 View all complaints
- 🔄 Update complaint status
- ❌ Delete complaints
- ✅ Integrated with PostgreSQL using Hibernate ORM
- ⚙️ Clean separation of concerns using DAO pattern

# 🧰 Tech Stack

- **Java**
- **Hibernate API**
- **PostgreSQL**
- **Maven**
- **VS Code (or any Java IDE)**

# 📂 Project Structure

          src/
              ├── com.example.complaint/
              │    └── MainApp.java
              ├── com.example.complaint.dao/
              │    └── ComplaintDAO.java
              └── com.example.complaint.entity/
              └── Complaint.java

# 📂 mavan dependancy
     <dependency>
      <groupId>org.hibernate.orm</groupId>
      <artifactId>hibernate-core</artifactId>
      <version>7.0.5.Final</version>
    </dependency>

    <dependency>
      <groupId>jakarta.persistence</groupId>
      <artifactId>jakarta.persistence-api</artifactId>
      <version>3.2.0</version>
    </dependency>

    <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <version>42.7.7</version>
    </dependency>

# 📂 Persistence API 
 can also find this in resources folder
  
          <?xml version="1.0" encoding="UTF-8"?>
          <persistence xmlns="https://jakarta.ee/xml/ns/persistence"version="3.0">
          <persistence-unit name="complaintPU" transaction-type="RESOURCE_LOCAL">
          <class>com.example.complaint.entity.Complaint</class>

         <properties>
                        <property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5433/mydb"/>
                        <property name="jakarta.persistence.jdbc.user" value="postgres"/>
                        <property name="jakarta.persistence.jdbc.password" value="1234"/>
                        <property name="jakarta.persistence.jdbc.driver" value="org.postgresql.Driver"/>
                        <property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
                        <property name="jakarta.persistence.schema-generation.database.action" value="update"/>
                       <property name="hibernate.show_sql" value="true"/>
                       <property name="hibernate.format_sql" value="true"/>
       </properties>
       </persistence-unit>
       </persistence>  


# 💡DEMO output

<img width="881" height="647" alt="output1" src="https://github.com/user-attachments/assets/34dc8c36-b993-4945-a63c-7600e9733490" />


# 🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

             
# 👩‍💻 Author                   
-    Name              -  javeriya jamadar
-    college           -  sesp 
- 📧 emil account     -  javeriyajamadar7@gmail.com
- 🔗 GitHub Profile   -  web7wizard 

#
**Proudly developed as part of a journey in learning and building real-world Java applications. 🎓💻**
      


