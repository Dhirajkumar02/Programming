import java.util.Scanner;
class Positive_Negative_Num{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer value: ");
		int n=sc.nextInt();
		sc.close();
		
		String rs="Positive";
		if(n<0)
		   rs="Negative";
	
		System.out.println(n+" is a "+rs);

	}
}