package arrays;

import java.util.Scanner;

//accept three numbers from uses and display in matrix form
public class array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][3];
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 numbers");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("enter no.");
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						System.out.println(arr[i][j]+ "\t");
						
					}
					System.out.println();
					
				}
		
		
		

	}

}