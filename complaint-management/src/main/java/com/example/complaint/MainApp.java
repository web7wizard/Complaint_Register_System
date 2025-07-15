package com.example.complaint;

import com.example.complaint.dao.ComplaintDAO;
import com.example.complaint.entity.Complaint;

import java.util.List;
import java.util.Scanner;

public class MainApp
 {
    public static void main(String[] args) {
        ComplaintDAO dao = new ComplaintDAO();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n------------------- Complaint Management System ------------------------");
            System.out.println("\nNOTE  ==  feel free to file complaint, i will surely help you to solve your problem *** ")
            System.out.println("1. Register your Complaint");
            System.out.println("2. View All Complaints file");
            System.out.println("3. Update Complaint Status");
            System.out.println("4. Delete Complaint");
            System.out.println("5. Exit");
            System.out.print("what you wanna do : ");

            int choice = sc.nextInt();
            

            switch (choice) {
                case 1 -> 
                {
                    System.out.print("lets file your issue --- ");
                    Complaint c = new Complaint();
                    System.out.print("Enter your name: ");
                    c.setUserName(sc.nextLine());
                    System.out.print("Enter complaint description: ");
                    c.setDescription(sc.nextLine());
                    dao.addComplaint(c);
                    System.out.println("Complaint registered... thanks.. dont worry i will try to solve your problem ..");
                }
                case 2 -> 
                {
                    List<Complaint> list = dao.getAllComplaints();
                    if (list.isEmpty())
                     {
                        System.out.println("No are register from people .....");
                     }
                     else
                      {
                        for (Complaint c : list)
                         {
                            System.out.printf("ID: %d | Name: %s | Desc: %s | Status: %s\n",
                                    c.getId(), c.getUserName(), c.getDescription(), c.getStatus());
                         }
                      }
                }
                case 3 ->
                 {
                    System.out.print("Enter complaint ID to update status:  ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new DESC: ");
                    String newStatus = sc.nextLine();
                    dao.updateStatus(id, newStatus);
                    System.out.println("Status updated .... thanks for update");
                }
                case 4 -> 
                {
                    System.out.print("Enter complaint ID to delete: ");
                    int id = sc.nextInt();
                    dao.deleteComplaint(id);
                    System.out.println("Complaint deleted.... hope your problem solved");
                }
                case 5 -> 
                {
                    System.out.println("Exiting.... feel free to enter your POV your data will not be leaked");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.... please enter valid option so i can help you...");
            }
        }
    }
}