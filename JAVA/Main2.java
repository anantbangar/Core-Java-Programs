class Main2 
{
	final int a;

	private int n=500;

	Main2()
	{
		a=200;
	}  

 	public static void main(String args[])
	{  
   		final int i;  
		i=100;  
   		System.out.println(i); 

		Main2 m2=new Main2();
			
		System.out.println(m2.a); 

		System.out.println(m2.n); 
 	}  
}  