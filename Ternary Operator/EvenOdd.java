import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		String res = checkEvenOdd(n);
		System.out.println(res+" Number");
		sc.close();
		}
		

	public static String checkEvenOdd(int n){
		String res = n % 2 == 0 ? "Even" : "Odd";   
		return res;
	}
}