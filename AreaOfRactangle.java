/* Project : To find out the 'Area of Rectangle '
   Author : Rahman
   Date   : 11/02/2021
*/
import java.util.Scanner;
class AreaOfRactangle{
	public static void main(String[]args){
		float area,wid,len;
		Scanner sc=new Scanner(System.in);

		System.out.println("    This is a program for Area of Rectangle :  ");

		System.out.println("    The formula for 'Area of ractange is ,   Area=Width*Length'  ");

		System.out.print("      Enter the Length of Rectangle : ");

	    len=sc.nextFloat();

	    System.out.print("      Enter the Width of Rectangle :  ");

	    wid=sc.nextFloat();

	    area=len*wid;

	    System.out.println("     Area of Rectangle is , Area =  "+area);
	}
}