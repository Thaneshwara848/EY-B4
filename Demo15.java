class A
{
	A()
	{	
		System.out.println("A ");	
	}
	
}
class B
{
	A()
	{	
		System.out.println("B ");
		// constructo over riding is not possible 
			// bcz consrtuctor name and clas name muct be same 	
	}	
}
class Demo15
{	
	public static void main(String args[])
	{
		A a = new A();
	}
}