package com.demo.crud.Util;

import java.util.Iterator;
import java.util.List;

import com.demo.crud.DAO.BookDAO;
import com.demo.crud.DTO.BookDTO;


public class Tester {
	
	public static void main(String[] args) {
//		BookDTO dto1=new BookDTO();
//		dto1.setBook_name("The Wings of Fire");
//		dto1.setBook_author("Dr APJ Abdul Kalam");
//		
//		BookDTO dto2=new BookDTO();
//		dto2.setBook_name("Harry Potter");
//		dto2.setBook_author("JK Rowling");
		
		BookDAO dao=new BookDAO();
//		dao.save(dto1);
//		dao.save(dto2);
		
//		List l1=dao.getAllInventory(id);
//		Iterator itr=l1.iterator();
//		while(itr.hasNext()) {
//			Object[] obj=(Object[])itr.next();
//			System.out.println("Sl.no.= "+String.valueOf(obj[0]));
//			System.out.println("Author name= "+String.valueOf(obj[1]));
//			System.out.println("Book Name= "+String.valueOf(obj[2]));
//		}
		
		
		List<BookDTO> invs=null;
		try {
			invs = BookDAO.getAllInventory();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        for (BookDTO inv : invs) {
            System.out.println("ID: " + inv.getBook_id() + ", Book Name: " + inv.getBook_name()+", Book author: "+inv.getBook_author());
        } 
	}
     
}
