package Loops_pack;

public class pattern_of_stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
				{
				System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}

	}

}
