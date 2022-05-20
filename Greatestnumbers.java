import java.util.Scanner;

public class Greatestnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println("The greater number is "+num1);
			
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("The greater number is "+num2);
			
		}
		else
		{
			System.out.println("The greater number is "+num3);
		}

	}

}
