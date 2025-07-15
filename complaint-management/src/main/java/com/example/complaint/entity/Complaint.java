package com.example.complaint.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;

    private String userName;
    private String description;
    private String status = "Pending";

    public Complaint() {}  

    
    public int getId()
     { return id; }

    public void setId(int id)
     { this.id = id; }

    public String getUserName() 
    { return userName; }

    public void setUserName(String userName)
     { this.userName = userName; }

    public String getDescription()
     { return description; }


    public void setDescription(String description)
     { this.description = description; }

    public String getStatus() 
    { return status; }

    public void setStatus(String status)
     { this.status = status; }
}
