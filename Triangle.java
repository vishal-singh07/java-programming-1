//Question7
package CipherSchool;
import java.util.*;
public class Triangle {
	void area(int a, int b,int c)
	{
		int s=(a+b+c)/2;
        double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.println("Area of Triangle is: " + area); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Triangle obj=new Triangle();
		System.out.println("Enter 3 sides of triangle");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		obj.area(s1, s2, s3);
	}

}
