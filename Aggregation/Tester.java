package Aggregation;

public class Tester {

	public static void main(String[] args) {
		Address a1=new Address("Tvm", "Kerala", "India");
		Student s1=new Student(1, "Seena", a1);//a1==>string representation in address.java
		Student s2=new Student(2, "Sookuttan", a1);
		Student s3=new Student(3, "Sree", a1);
		
		s1.display();
		s2.display();
		s3.display();

	}

}
