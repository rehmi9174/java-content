/* Project : Convert Ferenhide to degree centegrade  '
   Author : Rahman
   Date   : 11/02/2021
*/
import java.util.Scanner;
class FerenhideIntoDegree{
	public static void main(String[]args){

		float ferenhide,centegrate;
        

		Scanner sc = new Scanner(System.in);

		System.out.println("     The Formula for convert Ferenhide Into Degree Centegrate is ,'cen=((f-32)*5)/9 ");

		System.out.print("     Enter the ferenhide amount : ");
		ferenhide=sc.nextFloat();

		centegrate =((ferenhide-32)*5)/9;

		System.out.println("     The convertion result is , centegrate = "+centegrate);



	}
}