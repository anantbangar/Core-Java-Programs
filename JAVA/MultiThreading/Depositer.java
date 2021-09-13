//package com.multithreading;
public class Depositer extends Thread
{
	Customer c;
	
	Depositer(Customer c)
	{
		this.c=c;
	}

	public void run()
	{
		this.c.deposit(500);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}
	}
}
	