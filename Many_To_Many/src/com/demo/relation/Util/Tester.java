package com.demo.relation.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.relation.DTO.Product;
import com.demo.relation.DTO.ProductModel;


public class Tester {
    public static void main(String[] args) {

        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
                .addAnnotatedClass(ProductModel.class).buildSessionFactory();

        
        Session session = factory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        try {
            
            ProductModel model1 = new ProductModel("Iphone 15pro");
            ProductModel model2 = new ProductModel("Galaxy 13pro");

            
            Product product1 = new Product("Apple");
            Product product2 = new Product("Samsung");

            
            product1.getProductModels().add(model1);
            product1.getProductModels().add(model2);

            product2.getProductModels().add(model1);

            
            model1.getProducts().add(product1);
            model1.getProducts().add(product2);
            model2.getProducts().add(product1);

            
            session.save(product1);
            session.save(product2);

            
            transaction.commit();
        } finally {
            
            session.close();
            factory.close();
        }
    }
}
