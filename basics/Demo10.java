class Parent
{
	int site=2;
	int money=500000;
	String car="BMW";
	void use()
	{
		System.out.println("SITE :"+site);
		System.out.println("Money :"+money);
		System.out.println("CAR  :"+car);
	}
}
class Child  extends Parent
{
	String car="Breza";
	void use(String car)
	{
		System.out.println("SITE :"+site);
		System.out.println("Money :"+money);
		System.out.println("CAR  :"+car);
		System.out.println("CAR  :"+this.car);
		System.out.println("CAR  :"+super.car);
	}
}
class Demo10
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.use();

		System.out.println("==============");
		Child c = new Child();
		c.use("MARUTHI");	
	}
}




