import java.util.Scanner;
class Maximum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int i,sum;
		int a[]=new int[10];
		System.out.println("How many numbers you want to store in array :");
		int n=sc.nextInt();
		System.out.println("Enter the element in arrays : ");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
}