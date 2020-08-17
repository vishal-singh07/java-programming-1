//Question1
package CipherSchool;
interface sum
{
	int add(int a,int b);
}
interface sub
{
	int difference(int a,int b);
}
interface mul
{
	int product(int a,int b);
}
interface div{
	int safedivision(int a,int b);
}

public class Question1Assignment1 {
	 
	public static void main(String[] args) {
		sum ad=(a,b)->(a+b);
		sub dif=(a,b)->(a-b);
		mul pd=(a,b)->(a*b);
		div sd=(a,b)->(a/b);
		System.out.println("addition is : "+ ad.add(293, 332));
		System.out.println("Subtraction is : " +dif.difference(888, 332));
		System.out.println("Product is : "+pd.product(25, 34));
		System.out.println("Division is : "+sd.safedivision(100, 25));
	}

}

