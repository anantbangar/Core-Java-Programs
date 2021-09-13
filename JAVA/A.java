// Java program to illustrate 
// Instance Initialization Block 
// with super() 
  
// Parent Class 
class B 
{ 
    B() 
    { 
        System.out.println("B-Constructor Called"); 
    } 
  
    { 
        System.out.println("B-IIB block"); 
    } 
  
} 
  
// Child class 
class A extends B 
{ 
    A() 
    { 
       // super(); 
        System.out.println("A-Constructor Called"); 
    } 
    { 
        System.out.println("A-IIB block"); 
    } 
      
    // main function 
    public static void main(String[] args) 
    { 
        A a = new A(); 
    } 
} 
