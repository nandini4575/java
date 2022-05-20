package Thurshday_lab;

import java.util.Scanner;

public class Factorial_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num, p=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		for(i=1;i<=num;i++)
		{ 
			p=p*i;
		}
		System.out.println(+p);
		
		

	}

}
