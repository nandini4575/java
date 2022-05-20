//WAP to understand relational operators
import java.util.*;
class pro5
{
	public static void main(String args[])
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=(num1>num2)?num1:num2;
		System.out.println("the greater no. is = " +res);
	}
}