
import java.util.scanner;
public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("what do ant to do \n 1: ADD \t 2:SUB \n 3:MUL \t 4:DIV");
		 num3=sc.nextInt();
		
		if (num3==1)
		{
			System.out.println("Your Answer is="+(num1+num2));
		}
		else if(num3==2)
		{
			System.out.println("Your Anser is="+(num1-num2));
		}
		/*
		if else(num3==3);
		{
			System.out.println("Your Answer is="+num1*num2);
			
		}
		if else(num3==4);
		{
			System.out.println("Your Answer is="num1/num2);
		}
		else
		{
			System.out.println("Select from above options only");
		}
			
*/
	}

}