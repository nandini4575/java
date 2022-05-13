import java.util.Scanner;
public class Area_rect
{
  public static void main(String agrs[])
  {
          int length,width,area;
          Scanner sc=new Scanner(System.in);

          length=sc.nextInt();
          System.out.println("enter length of rectangle");
          width=sc.nextInt();
          System.out.println("enter width of rectangle");

          area=length*width;
          System.out.println("Area of rectangle is:"+area);
        }  
}     