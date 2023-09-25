abstract class A
{
	abstract void abc();
}
abstract class B extends A
{
	void abc()	
	{
		System.out.println("ABC method...!");
	}
	abstract void xyz();
}
class C extends B
{
	void xyz()
	{
		System.out.println("XYZ method...!");	
	}
}
class Demo11
{
	public static void main(String args[])
	{
			//B b = new B();
			C c = new C();
			c.abc();
			c.xyz();	
	}
}