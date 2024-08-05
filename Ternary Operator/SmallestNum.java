import java.util.Scanner;
// without using logical operator to check smallest number
class SmallestNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int res = checkSmallestNumber(x, y, z);
		System.out.println(res+" is Smallest Number among three numbers");
		sc.close();
		}
		

	public static int checkSmallestNumber(int x, int y, int z){
		int res = x < y ? x : y;
		res = res < z ? res : z;   
		return res;
	}
}