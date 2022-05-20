package Thurshday_lab;

import java.util.Scanner;

public class prime_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, m, ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check prime");
		n = sc.nextInt();
		
		m = n/2;
		for (i=2;i<=m;i++) 
		{
			ans=n%i;
		}
		if(ans==0) {
			System.out.println("Number is not prime");
			
		}
		else {
			System.out.println("number is prime");
			
		}
			
			
		
		
		

	}

}
