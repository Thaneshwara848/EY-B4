import java.util.*;
class Demo21
{
	public static void main(String args[])
	{
		m1();	
	}
	static void m1()
	{	
		m2();
		System.out.println("HI M1 method...! ");
	}
	static void m2()
	{
		m3();
		System.out.println("HI M2 method...! ");
	}
	static void m3()
	{
		try
		{
			System.out.println("HI M3 method...! ");
			Scanner sc= new Scanner(System.in);
		
			System.out.print("Enter A :");
			int a=sc.nextInt();

			System.out.print("Enter B :");
			int b=sc.nextInt();

			int res =a/b;
			System.out.println("Result : :"+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hi Boss /0 is not possible . please enter the correct value...!");
		}
		catch(InputMismatchException im)
		{
			System.out.println("Hi please enter only numbers .....!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
				System.out.println("Thank you...!");
		}
	}
}