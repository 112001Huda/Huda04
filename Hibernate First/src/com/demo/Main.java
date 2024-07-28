package com.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        //insert data into database
        Student student=new Student();
        student.setName("vijay");
        student.setLastName("kadpewad");
        student.setPincode(411052);
        session.save(student);
        t.commit();
        session.close();
        System.out.println("record saved successfully");



        }
    }
