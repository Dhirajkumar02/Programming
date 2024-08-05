import java.util.Scanner;
class SmallestNumAmong2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int res = checkSmallestNumber(x, y);
		System.out.println(res+" is smallest Number among two numbers");
		sc.close();
		}
		

	public static int checkSmallestNumber(int x, int y){
		int res = x < y ? x : y;   
		return res;
	}
}