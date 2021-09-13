//package com.multithreading;
class Test
{
	public static void main(String args[])
	{
		Customer c=new Customer();
		Withdrawal w=new Withdrawal(c);
		Depositer d=new Depositer(c);

		w.start();
		d.start();
	}
}