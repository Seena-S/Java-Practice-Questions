package com.demo.relation.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.relation.DTO.Product;
import com.demo.relation.DTO.ProductModel;

public class ProductModelDAO {

    private SessionFactory factory;

    public ProductModelDAO() {
        factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
                .addAnnotatedClass(ProductModel.class).buildSessionFactory();
    }

    public void saveProductModel(ProductModel productModel) {
        Session session = factory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(productModel);  // Save product model
        
        transaction.commit();
    }

    public void close() {
        factory.close();
    }
}
