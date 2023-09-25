class A implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<=30;i++)
			{
				if(Thread.currentThread().getName().equals("BMW"))
				{
					System.out.println(Thread.currentThread().getName()+" :"+i);
				}
				else if(Thread.currentThread().getName().equals("Benz"))
				{
					System.out.println("	"+Thread.currentThread().getName()+" :"+i);
				}
				else if(Thread.currentThread().getName().equals("Maruthi"))
				{
					System.out.println("		"+Thread.currentThread().getName()+" :"+i);
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class Demo29
{
	public static void main(String args[])
	{
		A a = new A();
		
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		Thread t3= new Thread(a);
		t1.start();
		t2.start();
		t3.start();
		t1.setName("BMW");
		t2.setName("Benz");
		t3.setName("Maruthi");
		for(int x=0;x<=30;x++)
		{
			System.out.println("				 X:"+x);		
			try
			{
				Thread.sleep(1000);
				if (x==10)
				{
					t1.suspend();
				}		
				if(x==14)
				{
					System.out.println("T1 Thread is :"+t1.isAlive());
				}
				if(x==15)
				{
					t2.suspend();
				}
				if(x==20)
				{
					t1.resume();
				}
				if(x==22)
				{
					t2.resume();
				}
				if(x==23)
				{
					t1.stop();
				}
				if(x==24)
				{
					System.out.println("T1 Thread is :"+t1.isAlive());
				}
			}
			catch(Exception e)
			{
			}
		}
	}
}
