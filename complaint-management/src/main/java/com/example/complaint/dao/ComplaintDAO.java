package com.example.complaint.dao;

import com.example.complaint.entity.Complaint;
import jakarta.persistence.*;

import java.util.List;

public class ComplaintDAO
 {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("complaintPU");

    public void addComplaint(Complaint c)
     {
       
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }

    public List<Complaint> getAllComplaints()
     {
       
        EntityManager em = emf.createEntityManager();
        List<Complaint> list = em.createQuery("FROM Complaint", Complaint.class).getResultList();
        em.close();
        return list;
    }

    public Complaint getComplaint(int id) 
    {
        EntityManager em = emf.createEntityManager();
        Complaint c = em.find(Complaint.class, id);
        em.close();
        return c;
    }

    public void updateStatus(int id, String newStatus)
     {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Complaint c = em.find(Complaint.class, id);
        if (c != null)
         {
            c.setStatus(newStatus);
            em.merge(c);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void deleteComplaint(int id)
     {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Complaint c = em.find(Complaint.class, id);
        if (c != null) 
        {
            em.remove(c);
        }
        em.getTransaction().commit();
        em.close();
    }
}