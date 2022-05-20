package arrays;

import java.util.Scanner;

public class userarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		row=sc.nextInt();
		System.out.println("Enter number of columns");
		col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("enter " +row*col+ "no ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				
				arr[i][j]=sc.nextInt();
			}
				
		}
		System.out.println("entered no's");
		for(i=0;i<row;i++)
		{
			
			for(j=0;j<col;j++)
			{

				
					System.out.print(arr[i][j]+"\t");
			}
				
			
		
		System.out.println();
		
		}
	
		

		
		

	}

}
