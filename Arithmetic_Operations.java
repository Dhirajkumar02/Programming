import java.util.Scanner;
class Arithmetic_Operations{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any two integer value: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
	sc.close();
		
		System.out.println("Sum of "+x+" & "+y+" is "+(x+y));
		System.out.println("Diff of "+x+" & "+y+" is "+(x-y));
		System.out.println("Multiply of "+x+" & "+y+" is "+(x*y));
		System.out.println("Quotient of "+x+" & "+y+" is "+(x/y));
		System.out.println("Remainder of "+x+" & "+y+" is "+(x%y));

	}
}