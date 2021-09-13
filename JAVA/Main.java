abstract class Base { 
    final void fun() { System.out.println("Derived fun() called"); } 
} 
   
class Derived extends Base 
{
	void fun1(){ System.out.println("Derived  called"); 
System.err.println("error message");
		int i=System.in.read();
System.out.println((char)i);} 
} 
   
class Main { 
    public static void main(String args[]) {  
       //Base b = new Derived(); 
	Derived b=new Derived();
       b.fun(); 
b.fun1();
    } 
}  