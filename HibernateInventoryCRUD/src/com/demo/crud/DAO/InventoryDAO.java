package com.demo.crud.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.crud.DTO.InventoryDTO;


public class InventoryDAO {
	public void save(InventoryDTO dto) {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(InventoryDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    	session.save(dto);
    	tx.commit();
    	}catch(Exception e) {
    		
    	}finally {
    		session.close();
    	}
   }
    public List<InventoryDTO> getAllInventories() {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(InventoryDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	List<InventoryDTO> inventories = session.createQuery("from InventoryDTO", InventoryDTO.class).getResultList();
        tx.commit();
        return inventories;
   }
    public void updateInventoryByCondition() {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(InventoryDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	List<InventoryDTO> inventories = session.createQuery("from InventoryDTO where productAmount < 100", InventoryDTO.class).getResultList();
        for (InventoryDTO inventory : inventories) {
            inventory.setProductAmount(150); // Updating to 150
            session.update(inventory);
        }
    		tx.commit();
    	
    	
    	}
   
    public void delete(int productId) {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(InventoryDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    		InventoryDTO fromdb=session.get(InventoryDTO.class,productId);
    	    session.delete(fromdb);
    	    tx.commit();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}finally {
    		session.close();
    	}
   }	
  
}