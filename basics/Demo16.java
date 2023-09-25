class Bank
{
	public void roi()
	{
		System.out.println("8 %");	
	}
}
class Sbi extends Bank
{
	public void roi()
	{
		System.out.println(" SBI 10 %");
	}
}
class Axis extends Bank
{
	public void roi()
	{
		System.out.println(" AXIS 12 %");
	}
}
class Icici extends Bank
{

}	
class Demo16
{
	public static void main(String args[])
	{
		Sbi s = new Sbi();
		s.roi();	
		Axis a = new Axis();
		a.roi();
		Icici i = new Icici();
		i.roi();	
	}
}