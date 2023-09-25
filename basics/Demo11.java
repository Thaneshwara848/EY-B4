class Parent
{
	
	Parent()
	{
		System.out.println("Hi Perent ");
	}	
}
class Child   extends Parent
{
	Child()
	{
		System.out.println("Hi Child ");
	}
}
class Demo11
{
	public static void main(String args[])
	{
		//Parent p = new Parent();		
		Child c = new Child();	
		// as soon as u create a child class object 
			// automaticvally it will cal the super class 
				// default condtrutor..!
		
		
	}
}




