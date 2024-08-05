import java.util.Scanner;
class LargestNumAmong3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int res = checkLargestNumber(x, y, z);
		System.out.println(res+" is largest Number among three numbers");
		sc.close();
		}
		

	public static int checkLargestNumber(int x, int y, int z){
		int res = x > y && x > z ? x : (y > z ? y : z);   
		return res;
	}
}