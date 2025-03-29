package Exception;
//Java code to show the
//overriding of finalize() method
import java.lang.*;
//Defining a class demo since every java class
//is a subclass of predefined Object class
//Therefore demo is a subclass of Object class
public class Finalize {
	protected void finalize() throws Throwable
	{
		try {
			System.out.println("inside demo's finalize()");
		}
		catch (Throwable e) {
			throw e;
		}
		finally {
			System.out.println("Calling finalize method of the Object class");// Calling finalize() of Object class			
			super.finalize();
		}
	}
	public static void main(String[] args) throws Throwable
	{	
		Finalize d = new Finalize();// Creating demo's object		
		d.finalize();// Calling finalize of demo
	}
}
