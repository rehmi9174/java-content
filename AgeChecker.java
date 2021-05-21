import java.util.Scanner;
class AgeChecker{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any age (EX: 1-100) :");
		int a = sc.nextInt();
		if(a<=12 && a>0){
			System.out.println(" You are a child ");
		}
		else if(a<=19&& a>=13){
			System.out.println(" You are teenager ");
		}
		else if(a<=60 && a>=19){
			System.out.println(" You are young ");
		}
		else if(a>60 && a<=100){
			System.out.println(" Yor ar  Old ");
		}
		else{
			System.out.printlns(" You entered a invalid age ");
		}
	}
}