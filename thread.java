import java.util.*;

class numgen implements Runnable
{
	 static double number;
public void run()
{
	Random r=new Random();
	while(true)
	{
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
}

class square implements Runnable
{ 
	double n;
	public void run()
	{
	while(true)
	{
		if((numgen.number%2)==0)
		{
		   n=Math.sqrt(numgen.number);
		   System.out.println("The squareroot of "+numgen.number+" is "+n);
		}
	}
}
}

class cube implements Runnable
{ 
	double n;
	public void run()
	{
	while(true)
	{
		if((numgen.number%2)!=0)
		{
		   n=Math.cbrt(numgen.number);
		   System.out.println("The cuberoot of "+numgen.number+" is "+n);
		}
	}
}
}

class thread
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

	