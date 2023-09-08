import java.util.Scanner;
class Emp
{
	int id,age;
	String name;
	Emp()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID :");
		 id=sc.nextInt();
	
		System.out.println("Enter Name :");
		 name=sc.next();
		
		System.out.println("Enter Age :");
		 age=sc.nextInt();		
	}
}
class Developer extends Emp
{
	int salary=50000;
	String desig="DEVELOPER";
	Developer(){
	}
	void display()
	{
		System.out.println("==============================");	
		System.out.println("ID  is :"+id);	
		System.out.println("Name  is :"+name);	
		System.out.println("AGE  is :"+age);	
		System.out.println("SAALRY  is :"+salary);	
		System.out.println("DESIG  is :"+desig);	
	}
	void udpatesalary()
	{
		salary=salary+5000;
		System.out.println("SALARY UPDATED.......!");	
	}
}
class Clerk extends Emp
{
	
	int salary=20000;
	String desig="CLERK";
	Clerk()
	{
	}
	void display()
	{
		System.out.println("==============================");	
		System.out.println("ID  is :"+id);	
		System.out.println("Name  is :"+name);	
		System.out.println("AGE  is :"+age);	
		System.out.println("SAALRY  is :"+salary);	
		System.out.println("DESIG  is :"+desig);	
	}	
	void udpatesalary()
	{
		salary=salary+5000;
		System.out.println("SALARY UPDATED.......!");	
	}

}
class Tester extends Emp
{
	
	int salary=40000;
	String desig="TESTER";
	Tester()
	{	
	}
	void display()
	{
		System.out.println("==============================");	
		System.out.println("ID  is :"+id);	
		System.out.println("Name  is :"+name);	
		System.out.println("AGE  is :"+age);	
		System.out.println("SAALRY  is :"+salary);	
		System.out.println("DESIG  is :"+desig);	
	}
	void udpatesalary()
	{
		salary=salary+5000;
		System.out.println("SALARY UPDATED.......!");	
	}

}
class Manager extends Emp
{
	
	int salary=80000;
	String desig="Manager";
	Manager()
	{	
	}
	void display()
	{
		System.out.println("==============================");	
		System.out.println("ID  is :"+id);	
		System.out.println("Name  is :"+name);	
		System.out.println("AGE  is :"+age);	
		System.out.println("SAALRY  is :"+salary);	
		System.out.println("DESIG  is :"+desig);	
	}
	void udpatesalary()
	{
		salary=salary+5000;
		System.out.println("SALARY UPDATED.......!");	
	}

}
class Demo8
{
	public static void main(String ar[])
	{
		int ch=0;
		Clerk c=null;
		Tester t=null;
		Developer d=null;		
		Manager m=null;
		Scanner sc= new Scanner(System.in);
		int op=0;
		do{
			System.out.println("1) CREATE ");
			System.out.println("2) DISPLAY");
			System.out.println("3) UPDATE SALRY ");
			op=sc.nextInt();
			if(op==1)
			{
				do
				{
					System.out.println("1) Clerk ");
					System.out.println("2) Tester ");
					System.out.println("3) Developer ");
					System.out.println("4) Manager ");
					System.out.println("5) Exit ");
			
					System.out.println(" Enter Choice  ");	
					ch=sc.nextInt();
					if(ch==1)
					{
						c = new Clerk();
					}
					else if(ch==2)
					{		
						t = new Tester();
					}
					else if(ch==3)
					{		
						 d= new Developer();
					}
					else if(ch==4)
					{		
						m = new Manager();
					}
				}while(ch<=4);	
			}
			if(op==2)
			{
				do
				{
					System.out.println("1) Clerk ");
					System.out.println("2) Tester ");
					System.out.println("3) Developer ");
					System.out.println("4) Manager ");
					System.out.println("5) Exit ");
			
					System.out.println(" Enter Choice  ");	
					ch=sc.nextInt();
					if(ch==1)
					{
						c.display();
					}
					else if(ch==2)
					{		
						t.display();
					}
					else if(ch==3)
					{		
						 d.display();
					}
					else if(ch==4)
					{		
						m.display();
					}
				}while(ch<=4);	
			}
			if(op==3)
			{
				do
				{
					System.out.println("1) Clerk ");
					System.out.println("2) Tester ");
					System.out.println("3) Developer ");
					System.out.println("4) Manager ");
					System.out.println("5) Exit ");
			
					System.out.println(" Enter Choice  ");	
					ch=sc.nextInt();
					if(ch==1)
					{
						c.udpatesalary();
					}
					else if(ch==2)
					{		
						t.udpatesalary();
					}
					else if(ch==3)
					{		
						 d.udpatesalary();
					}
					else if(ch==4)
					{		
						m.udpatesalary();
					}
				}while(ch<=4);	
			}
		}while(op<=3);
	}
}