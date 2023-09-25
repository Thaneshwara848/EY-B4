abstract  class Bank
{
	 Bank(){}
	 abstract void roi();
	 abstract void loan();
	void withdraw(){}
	//void miniStatament();we cant skip this in child classs 
}
abstract class Abc extends Bank
{
	void roi()
	{	
		System.out.println("ROI");	
	}
	void loan()
	{
		System.out.println("LOAN ");
	}	
	abstract void onlineTransfer();
}
class Xyz extends Abc
{	
	void onlineTransfer()
	{
		System.out.println("Online Transfer method");
	}
}
class Demo11
{
	public static void main(String args[])
	{
		//Bank b = new Bank();	 abstract cant create a object 
		//Abc a = new Abc();
		Xyz x= new Xyz();
		x.roi();
		x.loan();
		x.onlineTransfer();
	}
}