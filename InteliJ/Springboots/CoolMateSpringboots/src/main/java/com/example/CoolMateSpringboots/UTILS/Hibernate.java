package com.example.CoolMateSpringboots.UTILS;

import com.example.CoolMateSpringboots.DAL.Entities.*;
import com.example.CoolMateSpringboots.DAL.Entities.Product;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Hibernate {
    private SessionFactory sessionFactory;
    private Configuration configuration;
    public Hibernate(){
        configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        //ADD entities
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Brand.class);
        configuration.addAnnotatedClass(Category.class);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(OrderDetail.class);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Role.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Customer.class);
    }
    public SessionFactory builderSessionFactory(){
        if(sessionFactory == null || sessionFactory.isClosed()){
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
    public void closeSessionFactory(){
        if(sessionFactory != null && sessionFactory.isOpen()){
            sessionFactory.close();
        }
    }
}
