package com.demo.crud.DAO;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.crud.DTO.BookDTO;


public class BookDAO {
	
	public void save(BookDTO dto) {
		
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BookDTO.class);
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			session.save(dto);
			tx.commit();
		}catch(Exception e){
			System.out.println(e);
		}finally {
			session.close();
		}
	}
public static List<BookDTO> getAllInventory() {
		
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BookDTO.class);
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		
		List<BookDTO> inv=session.createQuery("FROM BookDTO", BookDTO.class).getResultList();
		
	    tx.commit();
	     return inv;
	}

}
