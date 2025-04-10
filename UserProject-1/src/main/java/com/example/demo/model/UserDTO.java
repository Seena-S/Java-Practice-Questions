package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class UserDTO {

    @Id   
    private int id;
    
    private String name;
    private int age;
    private String place;
    private String contactNumber;

    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", place=" + place + ", contactNumber="
				+ contactNumber + "]";
	}
}
