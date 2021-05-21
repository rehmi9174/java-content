import java.util.Scanner
class LeapYear{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a year : ");
		int a = sc.nextInt();
		if(a%4==0){
			System.out.println(" Leap Year ");
		}
		else{
			System.out.println(" Not a leap year ");
		}
	}