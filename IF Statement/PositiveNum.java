import java.util.Scanner;
class PositiveNum{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer value: ");
		int n=sc.nextInt();
		sc.close();
	
		if(n<0)
		   n=n*(-1);
	
		System.out.println("User entered integer is "+n);

	}
}