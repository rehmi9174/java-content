import java.util.Scanner
class EvenOdd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int a = sc.nextInt();
		if(a%2==0){
			System.out.println(" Number is even ");
		}
		else{
			System.out.println(" Number is odd ");
		}
	}
}