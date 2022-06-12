//WAP to create a class Reverse No, second class SOD , Third class use both the class property and display the output

package inheritance;

import java.util.Scanner;

public class multi_disp extends SOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      multi_disp obj=new multi_disp();
      obj.display();
      
	}
	public void display() 
	{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=sc.nextInt();
	digit_sum(num);
	rev(num);
		
	}

}
package inheritance;

import java.util.Scanner;

public class SOD extends rev_num {
	
	
	public void digit_sum(int a) 
	{
		int temp,sum=0,r;
		temp=a;
		while(a>0) 
		{
			r=a%10;
			sum=sum+r;
			a=a/10;
		}
		System.out.println(temp+" sum of digit ="+sum);
	}
	
}
package inheritance;

public class rev_num {
	
	public void rev(int a) 
	{
		int temp,rev=0,r;
		temp=a;
		while(a>0) 
		{
			r=a%10;
			rev=(rev*10)+r;
			a=a/10;
		}
		System.out.println(temp+" reverse no ="+rev);
	
	}

}