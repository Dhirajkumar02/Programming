import java.util.Scanner;
class Biggest_Among_3_Num{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer value: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
	sc.close();
	
		int big=x;

		if(y>big)
		   big=y;
		if(z>big)
		   big=z;

	        System.out.println(big+" is Biggest Number");

	}
}