package com.demo.crud.DAO;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.crud.DTO.FilmDTO;

public class FilmDAO {
    public void save(FilmDTO dto) {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(FilmDTO.class);
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
    public void selectALL(int id) {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(FilmDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    	FilmDTO fromdb=session.get(FilmDTO.class,id);
    	System.out.println(fromdb);
    	}catch(Exception e) {
    		System.out.println(e);
    	}finally {
    		session.close();
    	}
   }
    public void update(int id,String film_name) {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(FilmDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    	FilmDTO fromdb=session.get(FilmDTO.class,id);
    	if(fromdb!=null) {
    		fromdb.setFilm_name(film_name);
    		session.update(fromdb);
    		tx.commit();
    	}
    	}catch(Exception e) {
    		System.out.println(e);
    	}finally {
    		session.close();
    	}
   }
    public void delete(int id) {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(FilmDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    	FilmDTO fromdb=session.get(FilmDTO.class,id);
    	session.delete(fromdb);
    	tx.commit();
    	}catch(Exception e) {
    		System.out.println(e);
    	}finally {
    		session.close();
    	}
   }
	public List<FilmDTO> getFilmByDirector(String name) {
		List<FilmDTO> l1=null;
		Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(FilmDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    	Query qry= session.createQuery("select d.film_name,d.film_budget,d.film_id from FilmDTO d where d.film_dirname='"+name+"'");
    	l1=qry.list();
    	System.out.println(l1);
    	}catch(Exception e) {
    		System.out.println(e);
    	}finally {
    		session.close();
    	}
    	return l1;
		
	}
	
	public void updateFilmByDirector(String filmName, String dirName) {
		List<FilmDTO> l1=null;
		Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(FilmDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    	Query qry= session.createQuery("update FilmDTO d set d.film_name='"+filmName+"' where d.film_dirname='"+dirName+"'");
    	int c=qry.executeUpdate();
    	if(c>=1) {
    		System.out.println("DTO updated...");
    	}else System.out.println("Updation failure");
    	
    	}catch(Exception e) {
    		System.out.println(e);
    	}finally {
    		session.close();
    	}
    	
	}
	
	public void selectDetailsByDirector(String dirName) {
		List<FilmDTO> l1=null;
		Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(FilmDTO.class);
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tx=session.beginTransaction();
    	try {
    	Query qry= session.createQuery("from FilmDTO d where d.film_dirname='"+dirName+"'");
    	Object fromdb=qry.uniqueResult();
    	System.out.println(fromdb);
    	
    	}
    	catch(Exception e) 
    	{
    		System.out.println(e);
    	}
    	finally 
    	{
    		session.close();
    	}
    	
	}
}
