//Question4
package CipherSchool;

public class Circle {
	private double radius;
	private String color="red";
	Circle(){
		radius=1.0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	double getradius()
	{
		return radius;
	}
	double getArea()
	{
		return (3.14*radius*radius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		System.out.println(c1.getradius());
		System.out.println(c1.getArea());
		Circle c2=new Circle(2.0);
		System.out.println(c2.getradius());
		System.out.println(c2.getArea());

	}

}
