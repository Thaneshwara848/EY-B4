// aquring the property from parent to child is called as INHERITANCE 
// parent - super - base 
class A
{
	int a=10;int b= 20;
	void abc()
	{
		System.out.println("A class :"+a);
		System.out.println("A class  :"+b);
		System.out.println("A class  :"+(a+b));
	}
}
// child-- sub - derived 
class B extends A
{
	//int a=10;int b= 20;
	int c=50;int d=100;
	void atoz()
	{
		System.out.println("B class :"+a);
		System.out.println("B class  :"+b);
		System.out.println("B class  :"+(a+b));
	}
	void xyz()
	{
		System.out.println("B class :"+c);
		System.out.println("B class  :"+d);
		System.out.println("B class  :"+(c+d));
	}
}
class Demo9
{
	public static void main(String args[])
	{
		A a = new A();	a.abc();
		B b = new B();  b.atoz(); b.xyz();b.abc();
	}
}

Inheritance and its types : 

	aquring the property from parent to child 
	super class to child class 
	base class to derived class 

	TYPES: 
		Single level : only one parent and one child 
		muiltylevel : grand parent- child - sub child 
		hirirchy : one parent multyple childs 
		multiple : multiple parent on child 
		hybried  : combination of hirirchy + multiple 
		

	






