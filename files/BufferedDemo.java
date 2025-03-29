package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class BufferedDemo {

	public static void main(String[] args) {
		
//		try {
//		FileOutputStream f1=new FileOutputStream("D:/core java programs/Seena.txt");
//		BufferedOutputStream b1= new BufferedOutputStream(f1);//writing file to buffer
//		String s1="I like Java";
//		byte[] arr=s1.getBytes();//This is necessary because the BufferedOutputStream writes data in bytes, not in strings.
//		b1.write(arr);//it takes byte array. The byte array arr is written to the buffer. The buffer will hold this data until it is flushed or closed.
//		b1.flush();//ensures that any buffered data is written out to the file.
//		b1.close();
//		f1.close();
//		System.out.println("success!");
//		}
//		catch (Exception e){
//			
//		}
		
//		try {
//			FileInputStream f1=new FileInputStream("D:/core java programs/Seena.txt");
//			BufferedInputStream b1= new BufferedInputStream(f1);
//			
//			int i;
//			while((i=b1.read())!=-1) {
//				System.out.print((char)i);
//			}
//			b1.close();
//			f1.close();
//			}
//			catch (Exception e){
//				
//			}
		
//		try {
//			FileInputStream f1=new FileInputStream("D:/core java programs/Seena.txt");
//			FileInputStream f2=new FileInputStream("D:/core java programs/Print.txt");
//			SequenceInputStream b1= new SequenceInputStream(f1,f2);
//			
//			int i;
//			while((i=b1.read())!=-1) {
//				System.out.print((char)i);
//			}
//			b1.close();
//			f1.close();
//			}
//			catch (Exception e){
//				
//			}
		
//		try {
//			FileInputStream f1=new FileInputStream("D:/core java programs/Seena.txt");
//			FileInputStream f2=new FileInputStream("D:/core java programs/Print.txt");
//			FileOutputStream fout=new FileOutputStream("D:/core java programs/Out.txt");
//			SequenceInputStream s1=new SequenceInputStream(f1, f2);
//			
//			int i;
//			while((i=s1.read())!=-1) {
//				fout.write(i);
//			}
//			s1.close();
//			f1.close();
//			f2.close();
//			System.out.println("success!");
//			}
//			catch (Exception e){
//				
//			}
		
		try {
			FileOutputStream f1=new FileOutputStream("D:/core java programs/Seena.txt");
			FileOutputStream f2=new FileOutputStream("D:/core java programs/Print.txt");

			ByteArrayOutputStream b1=new ByteArrayOutputStream();
			b1.write(65);
			b1.writeTo(f1);
			b1.writeTo(f2);
			
			
			b1.close();
			f1.close();
			f2.close();
			System.out.println("success!");
			}
			catch (Exception e){
				
			}
	

}

}
