//final class Car 
class Car 
{
	 final int speed=200; 
	 String model="2019";
	 String color="black";
	final void display()
	{
		System.out.println("CAR :"+speed);
		System.out.println("CAR :"+model);
		System.out.println("CAR :"+color);	
	}
}
class BMW extends Car 
{
	
	final int speed=250; 
	 String model="2021";
	 String color="red";
	void display()
	{
		System.out.println("BMW :"+speed);
		System.out.println("BMW :"+model);
		System.out.println("BMW :"+color);	
	}
}
class Demo32
{
	public static void main(String args[])
	{
		Car c= new Car();
		System.out.println(c.speed);
		//c.speed=2000;
		//System.out.println(c.speed);
		BMW b = new BMW();
		b.display();		
	}
}
