import java.io.*;
import java.util.*;

class area1
{
	void area(int b,double h)
	{
		double area=0.5*b*h;
		System.out.println("Area of triangle is "+area);
	}

	void area(int l,int b)
	{
		double area=l*b;
		System.out.println("Area of rectangle is "+area);
	}

	void area(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle is "+area);
	}

}

class MethodOverloading
{
	public static void main(String args[])
	{
	area1 a=new area1();	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the height for the triangle");
	double h=sc.nextDouble();
	System.out.println("Enter the breadth for the triangle");
	int b1=sc.nextInt();
	System.out.println("Enter the length for the rectangle");
	int l=sc.nextInt();
	System.out.println("Enter the breadth for the rectangle");
	int b2=sc.nextInt();
	System.out.println("Enter the radius for the circle");
	double r=sc.nextDouble();
	a.area(b1,h);
	a.area(l,b2);
	a.area(r);
	}

	
}
