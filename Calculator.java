/* Project : Calculator '
   Author : Rahman
   Date   : 11/02/2021
*/
import java.util.Scanner;
class Calculator{
	public static void main(String [] args){
		float a,b,c;
		int ch;

		Scanner sc = new Scanner(System.in);

		do{

		System.out.println("   Enter you choice : - ");
		System.out.println("-------------------");
		System.out.println("   Enter 1 for Addition -");
		System.out.println("   Enter 2 for Substraction -");
		System.out.println("   Enter 3 for Multiplication -");
		System.out.println("   Enter 4 for Division -");
		System.out.println("   Enter 5 for Exit -");

		ch = sc.nextInt();

		/*System.out.print("    Enter first number : ");
		a=sc.nextFloat();
		System.out.println("");
		System.out.print("    Enter Second number : ");
		b=sc.nextFloat();*/

		System.out.println("        ");

		switch(ch){

			case 1 :
			System.out.print("    Enter first number : ");
		    a=sc.nextFloat();
		    System.out.println("");
		    System.out.print("    Enter Second number : ");
		    b=sc.nextFloat();
			c=a+b;
			System.out.println("       Addition="+c);
			break;

			case 2 :
			System.out.print("    Enter first number : ");
		    a=sc.nextFloat();
		    System.out.println("");
		    System.out.print("    Enter Second number : ");
		    b=sc.nextFloat();
			c=a-b;
			System.out.println("       Substraction="+c);
			break;

			case 3 :
			System.out.print("    Enter first number : ");
		    a=sc.nextFloat();
		    System.out.println("");
		    System.out.print("    Enter Second number : ");
		    b=sc.nextFloat();
			c=a*b;
			System.out.println("       Multiplication="+c);
			break;

			case 4 :
			System.out.print("    Enter first number : ");
		    a=sc.nextFloat();
		    System.out.println("");
		    System.out.print("    Enter Second number : ");
		    b=sc.nextFloat();
			c=a/b;
			System.out.println("       Division="+c);
			break;

			case 5 :
			System.out.println("------Exit------");
			break;
		}
		System.out.println("   ");
	} while(ch!=5);



	}
}