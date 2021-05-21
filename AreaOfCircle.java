/* Project : To find out the area of circle '
   Author : Rahman
   Date   : 11/02/2021
*/
import java.util.Scanner;
class AreaOfCircle{
	public static void main(String[]args){
		float radius,area , pie=3.142f;

		Scanner sc = new Scanner(System.in);

		System.out.println("     This program can find the area of circle , the formula for area of circle is , A=3.142*r*r, where 'r' is th radius of circle :");

		System.out.print("     Enter the Radius of circle :");

        radius=sc.nextFloat();

        area=pie*radius*radius;

        System.out.println("     The area of given circle is , Area= "+area);




	}


}