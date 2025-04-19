package com.demo.relation.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.relation.DTO.Product;
import com.demo.relation.DTO.ProductModel;

public class ProductDAO {

    private SessionFactory factory;

    public ProductDAO() {
        factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
                .addAnnotatedClass(ProductModel.class).buildSessionFactory();
    }

    public void saveProductWithModels(Product product) {
        Session session = factory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(product);  // Save product and its associated models
        
        transaction.commit();
    }

    public void close() {
        factory.close();
    }
}
