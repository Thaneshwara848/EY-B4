import java.util.Scanner;
class A
{
	int id;
	String name;
	int age;
	 double / float salary 
	string desig ;
	
	A()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter name :");
		name = sc.next();

		System.out.println("ENter Age :");
		 age = sc.nextInt();	

		
	}
	void display()
	{
		System.out.println("MY Name is :"+name);
		System.out.println("MY Age is :"+age);
	}
	
}
class Demo3
{
	public static void main(String args[])
	{
		A a = new A();
		a.display();
	}
}