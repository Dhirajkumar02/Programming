import java.util.Scanner;
class CheckNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		String res = checkNumber(n);
		System.out.println(res+" Number");
		sc.close();
		}
		

	public static String checkNumber(int n){
		String res = n >= 0 ? "Positive" : "Negative";   
		return res;
	}
}