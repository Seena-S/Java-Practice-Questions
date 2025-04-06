package com.demo.crud.Util;

import java.util.Iterator;
import java.util.List;

import com.demo.crud.DAO.FilmDAO;
import com.demo.crud.DTO.FilmDTO;

public class FilmTester {
     public static void main(String[] args) {
    	 
    	 FilmDTO dto=new FilmDTO();
    	 dto.setFilm_name("Hidden");
    	 dto.setFilm_dirname("Duffer Brothers");
    	 dto.setFilm_budget(2220000);
    	 
    	 FilmDTO dto1=new FilmDTO();
    	 dto1.setFilm_name("Eater");
    	 dto1.setFilm_dirname("Duffer Brothers");
    	 dto1.setFilm_budget(7610000);
    	 
	     FilmDAO dao=new FilmDAO();
//	     dao.save(dto1);
//	     dao.selectALL(2);
//	     dao.update(3, "United Red Army");
//	     dao.delete(1);
//	     System.out.println("Film updated successfully..");
//	     List l1=dao.getFilmByDirector("Duffer Brothers");
//	     Iterator itr=l1.iterator();
//	     while(itr.hasNext()) {
//	    	Object[] obj= (Object[]) itr.next();
//	    	System.out.println("name= "+String.valueOf(obj[0]));
//	    	System.out.println("budget= "+String.valueOf(obj[1]));
//	    	System.out.println("id= "+String.valueOf(obj[2]));
//	    	System.out.println();}
	     
//	     dao.updateFilmByDirector("Ironman", "Sam Raimi");
	     dao.selectDetailsByDirector("Sam Raimi");
	     
    }
}
