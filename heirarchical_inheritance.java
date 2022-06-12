package Hera_inher;

public class Hera2 extends Hera6
{
	public static void main(String[] args)
	{
    	// TODO Auto-generated method stub
		Hera2 obj=new Hera2();
		obj.add();
	}

	public void add() 
	{
		accept();
        int res=num1+num2;
        System.out.println("Addition of two number is /t"+res);
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------

package Hera_inher;

public class Hera3 extends Hera6
{
	public static void main(String[] args)
	{
    	// TODO Auto-generated method stub
		Hera3 obj=new Hera3();
		obj.sub();
	}

	public void sub() 
	{
		accept();
        int res=num1-num2;
        System.out.println("Substraction of two number is/t" +res);
	}


}

-----------------------------------------------------------------------------------------------------------------------------------------------------
package Hera_inher;

public class Hera4 extends Hera6
{
	public static void main(String[] args)
	{
    	// TODO Auto-generated method stub
		Hera4 obj=new Hera4();
		obj.mul();
	}

	public void mul() 
	{
		accept();
        int res=num1*num2;
        System.out.println("Multiplication of two number is/t" +res);
	}


}

------------------------------------------------------------------------------------------------------------------------------------------------------

package Hera_inher;

public class Hera5 extends Hera6
{
	public static void main(String[] args)
	{
    	// TODO Auto-generated method stub
		Hera5 obj=new Hera5();
		obj.div();
	}

	public void div() 
	{
		accept();
        int res=num1/num2;
        System.out.println("Division of two number is/t" +res);
	}


}
--------------------------------------------------------------------------------------------------------------------------------------------------------

package Hera_inher;

public class Hera1 extends Hera6
{
	public static void main(String[] args)
	{
    	// TODO Auto-generated method stub
		Hera1 obj=new Hera1();
		obj.mod();
	}

	public void mod() 
	{
		accept();
        int res=num1%num2;
        System.out.println("modulus of two number is/t" +res);
	}


}