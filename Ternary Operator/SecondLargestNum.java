import java.util.Scanner;
class SecondLargestNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int res = checkLargestNumber(x, y, z);
		System.out.println(res+" is second largest number among three numbers");
		sc.close();
		}
		

	public static int checkLargestNumber(int x, int y, int z){
		int res = (x > y && x < z) || (x > z && x < y) ? x : (y > x && y < z) || (y > z && y < x) ? y : z;   
		return res;
	}
}