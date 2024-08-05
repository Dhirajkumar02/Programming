import java.util.Scanner;
class EvenOdd{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer value: ");
		int x=sc.nextInt();
		sc.close();
		
		String rs="Odd";  // String rs = "Even";
			
		if(x%2==0)        // if(x%2==1)
		   rs="Even";     // rs="Odd";
	
		System.out.println(x+" is an "+rs);

	}
}