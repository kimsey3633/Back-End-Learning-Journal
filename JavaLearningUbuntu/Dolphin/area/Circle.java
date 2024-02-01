package Dolphin.area;

public class Circle
{
	double radius;
	final double PI;

	public Circle(double r)
	{
		radius = r;
		PI = 3.141592;
	}

	public double getArea()
	{
		return radius * radius * PI;
	}
}
