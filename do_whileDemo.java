package Loops_pack;

import java.util.Scanner;

public class do_whileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		char ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t ---Raj Food Corner---\t");
		do
		{
			System.out.println("1:Samosa");
			System.out.println("2:Idli");
			System.out.println("3:Maggi");
			System.out.println("4:Pizza");
			choice=sc.nextInt();
			System.out.println("Do you want to add any item Yes/No");
			ans=sc.next().charAt(0);
		}while(ans=='y'||ans=='Y');
		System.out.println("Thanks for coming ");

	}

}
