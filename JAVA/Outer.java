interface OuterInterface 
{ 
    public void InnerMethod(); 
    public interface InnerInterface 
    { 
        public void Method(); 
    } 
} 
public class Outer implements /*OuterInterface.InnerInterface,*/ OuterInterface 
{ 
    public void InnerMethod() 
    { 
        System.out.println(100); 
    } 

	public void Method() 
    { 
        System.out.println(200); 
    } 
      
      
    public static void main(String[] args) 
    { 
        Outer obj = new Outer(); 
        obj.InnerMethod(); 
	obj.Method();
    } 
} 