package inheritance;

import java.util.Scanner;

public class Hybrid1 {
	int num;
	int i,j,temp;
	int[] arr=new int [num];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void accept() 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for checking:");
		num=sc.nextInt();
		
	}
	public void accept1() 
	{
			accept();
			
			Scanner sc =new Scanner(System.in);
			System.out.println("enter"+num+" number");
			for(i=0;i<num;i++) 
			{
				arr[i]=sc.nextInt();
			}
	}

}
package inheritance;

public class H_pali extends Hybrid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H_pali obj=new H_pali();
		obj.palindrome();

	}
	public void palindrome() 
	{
		accept();
		int rev=0,r,temp;
		temp=num;
		while(num>0) 
		{
			r=num%10;
			rev=(rev*10)+r;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println(temp+" is a palindrome");
		}
		else
			System.out.println(temp+" is not a palindrome");
	}

}
package inheritance;

import java.util.Scanner;

public class H_greatest extends Hybrid1 {
	int i,j,temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H_greatest obj =new H_greatest();
		obj.greatest_no();

	}
	public void greatest_no() 
	{
		accept1();
		
		System.out.println("entered numbers are: ");
		for(i=0;i<num;i++) 
		{
			System.out.println(arr[i]);
		}
		for(i=0;i<num;i++) 
		{
			for(j=i+1;j<num;j++)
			if(arr[j]<arr[i]) 
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		System.out.println("largest number :"+arr[num-1]);

		
		
		
	}

}
package inheritance;

import java.util.Scanner;

public class H_percentage extends H_greatest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H_percentage obj =new H_percentage();
		obj.per();
		

	}
	public void per() 
	{
		greatest_no();
		
		for(i=0;i<num;i++) 
		{
			temp=temp+arr[i];
		}
		int per=(temp*100)/(num*100);
		System.out.println("Percentage is :"+per);
	}

}