package com.demo.crud.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Books")
public class BookDTO implements Serializable {
    @Id    
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
    @Column(name="book_id")
	private int book_id;
    @Column(name="book_name")
	private String book_name;
    @Column(name="book_author")
	private String book_author;
    
    public BookDTO() {
		System.out.println("DTO created...");
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	@Override
	public String toString() {
		return "BookDTO [book_id=" + book_id + ", book_name=" + book_name + ", book_author=" + book_author + "]";
	}
    
}
