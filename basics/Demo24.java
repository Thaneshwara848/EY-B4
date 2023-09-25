class A
{
	int age=20;
	void display()throws InvalidAgeException
	{
		if(age<21){
				throw new InvalidAgeException(" Invalid Age ");
		}
	}
}
class Demo11
{
	public static void main(String args[]) 
	{
		try
		{
			A a = new A();
			a.display();		
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i);
		}
	}	
}
class InvalidAgeException extends Exception
{	
	InvalidAgeException(String str)
	{
		super(str);
	}
}

				