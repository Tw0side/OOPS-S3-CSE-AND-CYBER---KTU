import java.util.*;

class numgen implements Runnable
{
	 static double number;
public void run()
{
	Random r=new Random();
	
	
		number=r.nextInt(50);
		System.out.println("Random number generated: " + number);
		try 
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted exception"+e);
		}
	

}
}

class square implements Runnable
{ 
	double n;
	public void run()
	{
	
	
		if((numgen.number%2)==0)
		{
		   n=numgen.number*numgen.number;
		   System.out.println("The square of "+numgen.number+" is "+n);
		   try 
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted exception"+e);
		}
		}
	
	}
}

class cube implements Runnable
{ 
	double n;
	public void run()
	{
	
	
		if((numgen.number%2)!=0)
		{
		   n=numgen.number*numgen.number*numgen.number;
		   System.out.println("The cube of "+numgen.number+" is "+n);
		   try 
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted exception"+e);
		}
		}

	
	}
}

class MultiThreading
{
	public static void main(String args[])
	{
		Thread generator=new Thread(new numgen());
		Thread even=new Thread(new square());
		Thread odd=new Thread(new cube());

		generator.start();
		even.start();
		odd.start();
	}
}

	
