class A 
{ 
    public A(String s)  
    { 
        System.out.print("A"); 
    } 
} 
  
public class B extends A  
{ 
    public B(String s)
    {
	super(s); 
        System.out.print("B"); 
    } 
    public static void main(String[] args)  
    { 
       B b= new B(); 
        System.out.println(" "); 
    } 
} 