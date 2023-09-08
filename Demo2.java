class A
{
	A()
	{
		System.out.println("A class");	
	}
	void abc()
	{
		System.out.println("A class abc method");	
	}
}
class B
{
	B()
	{
		System.out.println("B  class");	
	}
	void xyz()
	{
		System.out.println("B class XYZ method");
	}
}
class Demo2
{
	public static void main(String args[])
	{
		System.out.println("Demo2 class");
		A a = new A();
		a.abc();
		a.abc();
		a.abc();
		B b = new B();
		b.xyz();
	}
}