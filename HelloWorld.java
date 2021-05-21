
//First programm

class HelloWorld{
  public static void main(String[]args){
    System.out.println("Hello World ");
  }
}
class Simple{
	
	public static void main(String[]args){
		System.out.println(" Hello Java ");
		System.out.println(" For loop ");
		for(int i=1;i<=10;i++){
			System.out.println(" i = "+i);
		}
		System.out.println(" Nested for loop ");
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.println(i+" " +j);
			}
		}
		System.out.println(" Pyramid Example with for loop ");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" for-each loop : ");
		int arr[]={12,13,22,44,55,66,77};
		// Printing array using for-each loop 
		for(int i:arr){
			System.out.println("i = "+i);
		}
		System.out.println(" While loop ");
		int i =1;
		while( i<=10){
			System.out.println(" i = "+i);
			i++;
		}
		System.out.println(" do-while loop " );
		int j=1;
		do{
			System.out.println(" j = "+j);
			j++;
		}while (j<10);
		}
}

class SecondProgram{
	public static void main(String[]args){
		System.out.println("Hello Second program");
		System.out.println("I am the owner of this program " ) ;
		System.out.println(" If you are interested in the java programing i can teach youn java in a very east manner");
		System.out.println("OK, now we will meet in the upcoming lectures , take care yourself , byee byee");
		int data=50; // here data is a variable
		System.out.println("The value of data is , data = "+data);
		// java variable example : Add two numbers
		int a= 50;
		int b=70;
		int c=a+b;
		System.out.println("The sum of two variable is : a+b="+c);
		}
		
}
class OperatorExample{
	public static void main(String[]args){
		int x=10;
		System.out.println(x++);//10
		System.out.println(++x); //12
		System.out.println(x--); //12
		System.out.println(--x); //10
	}
}

// It is a program to demonstrate the use of if else-if ladder
// It is a program of grading ststem for fail,D grade,C grade,B grade,A grade,A+ grade
 class IfElseIfExample{
	 public static void main(String[]args){
		 int marks=101;
		 if(marks<50){
			 System.out.println("Fail");
		 }
		 else if(marks>=50 && marks<=60){
			 System.out.println("D grade");
		 }
		 else if(marks>=60 && marks<=70){
			 System.out.println("C grade");
		 }
		 else if(marks>=70 && marks<=80){
			 System.out.println("B grade");
		 }
		 else if(marks>=80 && marks<=90 ){
			 System.out.println("A grade");
			 
		 }
		 else if(marks>=90 && marks<100){
			 System.out.println("  A+ grade ");
		 }
		 else{
			 System.out.println("Enter number is invalid");
		 }
	 }
	 
 }
