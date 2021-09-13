//package com.multithreading;
public class Withdrawal extends Thread
{
	Customer c;
	
	public Withdrawal(Customer c)
	{
		this.c=c;
	}

	public void run()
	{
		this.c.withdraw(1200);

		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}
	}	

}