interface A 
{ 
  public void fun(); 
} 
  
class B implements A 
{  
    // If we change public to anything else, 
    // we get compiler error 
  public void fun() 
    { 
        System.out.println("fun()"); 
    } 
} 
  
class C 
{ 
    public static void main(String[] args) 
    { 
        B b = new B(); 
        b.fun(); 
    } 
}