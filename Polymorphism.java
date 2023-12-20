import java.io.*;
import java.util.*;

abstract class Shape
{
	abstract void numberOfsides();
	
}

class triangle extends Shape
{
	void numberOfsides()
	{
		System.out.println("The triangle has 3 sides");
	}
}


class rectangle extends Shape
{
	void numberOfsides()
	{
		System.out.println("The rectangle has 4 sides");
	}
}

class hexagon extends Shape
{
	void numberOfsides()
	{
		System.out.println("The hexagon has 6 sides");
	}
}

class Polymorphism
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		triangle t=new triangle();
		hexagon h=new hexagon();

		r.numberOfsides();
		t.numberOfsides();
		h.numberOfsides();
	
	}
}

