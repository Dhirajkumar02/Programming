import java.util.Scanner;
class CheckEligible{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		String res = checkEligibility(age);
		System.out.println(res);
		sc.close();
		}
		

	public static String checkEligibility(int age){
		String res = age >= 22 && age <= 30 ? "Eligible" : "Not Eligible";   
		return res;
	}
}