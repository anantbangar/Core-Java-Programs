//package com.multithreading;
public class Customer
{
	int amount=1000;

	synchronized public void withdraw(int amount) 
	{
		System.out.println("Balance is "+this.amount);

		if(this.amount<amount)
		{
			System.out.println("account balance is less for withdrawal");
			
			try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}

		this.amount=this.amount-amount;
		System.out.println("amount withdraw completed....");
		System.out.println("Balance is "+this.amount);

		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}

		notify();
	}

	synchronized public void deposit(int amount)
	{
		this.amount=this.amount+amount;
		System.out.println("amount deposit completed....");
		System.out.println("Balance is "+this.amount);

		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}

		notify();

	}

}