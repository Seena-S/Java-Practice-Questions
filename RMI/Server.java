import java.rmi.*;
class Server
{
     public static void main(String[] args) throws Exception
     {
        AddC obj=new AddC();
        Naming.rebind("ADD",obj);
        System.out.println("Server started....");
     } 
}