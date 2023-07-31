import java.util.Scanner;

public class CalculatorBrain {
	
	
	public static void main(String[] args) {
		
           Scanner console = new Scanner(System.in);
			Integer a;
			Integer b;
			
			System.out.println("Enter a: ");
			a=console.nextInt();
			System.out.println("Enter b: ");
			b=console.nextInt();
			
			printSuma(a,b);
			
			printRest(a,b);
			printDiv(a,b);
			printMult(a,b);
		
			//printNAmeLength(name);
			console.close();
	}
	
	public static void printSuma(int a, int b){
		System.out.println(a+b);
	}
	
	public static void printRest(int a, int b){
		System.out.println(a-b);
	}
	
	public static void printDiv(float a, float b){
		System.out.println(a/b);
	}
	
	public static void printMult(int a, int b){
		System.out.println(a*b);
	}
	
}
