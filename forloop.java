package Loops_pack;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, min, max,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting point");
		min = sc.nextInt();
		System.out.println("Enter end point ");
		max = sc.nextInt();
		if(min<max) {
			for(i=min;i<=max;i++)
			{
				System.out.println(i);
			}
		}
		else if (min>max)
		{
			for(i=min;i>=max;i--)
			{
				System.out.println(i);
			}
		}
		else {
			System.out.println("enter valid number");
		}

		
		

	}

}
