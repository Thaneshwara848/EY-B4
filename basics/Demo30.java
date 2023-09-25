class A implements Runnable
{
	public  synchronized  void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class Demo30
{
	public static void main(String args[])
	{
		A a = new A();
		
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		
		t1.start();
		t2.start();
		
		t1.setPriority(9);
		t2.setPriority(3);
		
		t1.setName("Rama");
		t2.setName("Seetha");	
	}
}


setName
get

setpriority
get

sleep

suspend
resume

stop

Thread.currentThread

srart
run 
 Write aAnswer of all thebelow question 
	
Whts is Thread ? 
wat to achive it 
Thread life cycle 

Multythreading 
multi processing

setpes to 
	Extends Thread
	implenmemnting Runnable 





