//Program to print pyramid of stars 
package thursday_lab2;

import java.util.Scanner;

public class User_input_pyramid 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row for pyramid:");
		int row=sc.nextInt();  //row = 3
		
		for(i=1; i<=row; i++) {
			
			//for loop for blank space
			for(j=i;j<=row-1;j++)
			{
				System.out.print(" ");
			}
			//for loop for inner loop
			for(j=1;j<=2*i-1;j++)  //OR j<2*i
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }

}