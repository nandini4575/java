//WAP to create a class which contain the method Palindrom .the second class will use the proerty of first class and display the output.

package inheritance;

import java.util.Scanner;

public class pali_disp extends palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pali_disp obj=new pali_disp();
      obj.display();
	}
	public void display() 
	{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=sc.nextInt();
	pali(num);
		
	}

}
package inheritance;

public class palindrome {
           
	public void pali(int a) 
	{
		int rev=0,r,temp;
		temp=a;
		while(a>0) 
		{
			r=a%10;
			rev=(rev*10)+r;
			a=a/10;  	
		}
		if(temp==rev) 
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
			System.out.println(temp+" is not a palindrome number");
	}
}