import java.util.Scanner;
class Biggest_Among_2_Num{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer value: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
	sc.close();
	
		if(x>y)
			System.out.println(x+" is Biggest Number");
		if(y>=x)
			System.out.println(y+" is Biggest Number");

		// int big=x;
		// if(y>big)
		// big=y;
		// System.out.println(big+" is Biggest Number");

	}
}