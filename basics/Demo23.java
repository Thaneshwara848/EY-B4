import java.util.*;
import java.io.*;
class Demo23
{
	public static void main(String args[]) 
	{
			String name="Thanesh";
			System.out.println(name.length());

			//name=null;
			//System.out.println(name.length());

			int arr[]={0,10,20,30,40,50,60};
			System.out.println(arr[0]);
			//System.out.println(arr[7]); ArrayIndexOutOfBoundsException


			String op="10";
			//String op="10A";NumberFormatException
			int nu=Integer.parseInt(op);
			System.out.println(nu);

			//int res = 100/ 0 ; : ArithmeticException	 
			// InputMismatchException	

			//Thread.sleep(1000);InterruptedException
			// SQLEXCEPTIOn : jdbc 
			// IOException : Io packag

	}
}