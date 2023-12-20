import java.util.*;

class test
{
	void divide(int x,int y)throws ArithmeticException 
	{
		if(y==0)
		{
			throw new ArithmeticException("Division by zero not possible");
		}
		else
		{
			System.out.println("The result after division is "+ x/y);
		}
	}
}





class Exception
{
	public static void main(String[] args)
	
	{
		int a,b;
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first digit ");
		a=sc.nextInt();
		System.out.println("Enter the denominator ");
		b=sc.nextInt();
		test t=new test();
		t.divide(a,b);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("The program is completed");
	}


	}
}
