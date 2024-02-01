package Dolphin.perimeter;

public class Circle
{
	double radius;
	final double PI;

	public Circle(double r)
	{
		radius = r;
		PI = 3.141592;
	}

	public double getPerimeter()
	{
		return radius * 2 * PI;
	}
}
