package Aggregation;

public class Student {
	
	int rollno;
	String name;
	Address adr;//aggregation==>it is must to have a 'has-a' relationship. student has address.
	
	public Student(int rollno, String name, Address adr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.adr = adr;
	}
	void display() {
		System.out.println("rollno: "+rollno+"\nname: "+name+"\naddress: "+adr);
//		System.out.println("name: "+name);
//		System.out.println("address: "+adr);
	}
	

}
