import java.util.Scanner;

public class switchprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choiw \n 1: greater beween three numbers \t 2: area of rectangle \n 3: cube if number is divisible by 7 \t 4: rate of interest");
		num1=sc.nextInt();
		switch(num1)
		{
		case 1:
			int num2,num3,num4;
			
			System.out.println("Enter three numbers");
			num4=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
			if (num4>num2 && num4>num3)
			{
				System.out.println("The greater number is "+num4);
				
			}
			else if(num2>num4 && num2>num3)
			{
				System.out.println("The greater number is "+num2);
				
			}
			else
			{
				System.out.println("The greater number is "+num3);
			}
			break;
			
		case 2:
			int l,b;
			System.out.println("Enter rectangle's lenghth and breadth");
			l=sc.nextInt();
			b=sc.nextInt();
			System.out.println("The area of rectangle is "+(l*b));
			break;
			
		case 3:
			int n;
			System.out.println("enter your number");
			n=sc.nextInt();
			if(n%7==0)
			{
				System.out.println("cube of number is "+(n*n*n));
				
			}
			else
			{
				System.out.println("Enter a number multiple of 7");
			}
			break;
			
		case 4:
			int age , gen;
			System.out.println("Enter your age");
			age=sc.nextInt();
			System.out.println("enter your genger \n 1: male \t 2: female");
			gen=sc.nextInt();
			if (age>=60)
			{
				if (gen==1)
				{
					System.out.println("Rate of inerest is 7%");
				}	
				else
				{
					System.out.println("Rate of interest is 7.5%");
				}
			}
			else
			{
				System.out.println("Rate of interest is 5%");
				
			}
			break;
			
			default:
				System.out.println("invalid choice ");
				break;
				
				
					
			
			
				
			
		
		}
		
	

	}

}
