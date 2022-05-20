package Loops_pack;

public class patterns_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;

		for(i=1;i<=5;i++)
		{
			for(j=i;j<=4;j++)
			{
				System.out.print(" ");
			}	
			for(j=1;j<2*i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}