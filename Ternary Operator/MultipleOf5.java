import java.util.Scanner;
class MultipleOf5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		String res = checkNumber(n);
		System.out.println(res);
		sc.close();
		}
		

	public static String checkNumber(int n){
		String res = n%5 == 0 ? "Yes" : "No";   
		return res;
	}
}