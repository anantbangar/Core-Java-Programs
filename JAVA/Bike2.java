
class Vehicle
{  
	void run()
	{
		System.out.println("Vehicle is running");
	}  
}  

class Bike21 extends Vehicle
{  
	
  	void run()
	{
		//super.run();
		System.out.println("Bike is running safely");
		//super.run();
	}
	
}

class Bike2
{
  
  	public static void main(String args[])
	{  
  		Vehicle obj=new Vehicle();
  		obj.run(); 
	
  	}  
}  