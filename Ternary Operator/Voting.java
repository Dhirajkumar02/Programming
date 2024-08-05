import java.util.Scanner;
class Voting{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		String res = checkEligible(age);
		System.out.println(res);
		sc.close();
		}
		

	public static String checkEligible(int age){
		String res = age >= 18 ? "Eligible for voting" : "Not Eligible for voting";   
		return res;
	}
}