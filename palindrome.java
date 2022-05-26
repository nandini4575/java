
//Program to find if a number is palindrome or not

package java_loop;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		//Formula for reversing a number:  reverse = reverse * 10 + remainder (in loop)
		int n1=num, reverse = 0, rem;
		while(n1 != 0)
		{
			rem=n1%10; //provides remainder
			
			reverse = reverse * 10 + rem;  //storing the value in reverse order
			
			n1=n1/10; //provides quotient, condition for while loop
		}
		//A palindrome number remains same after reversing it.
		if(num==reverse) {
			System.out.println("The no. is palindrome.");
		}
		else {
			System.out.println("The number is not a palindrome.");
		}

	}

}
