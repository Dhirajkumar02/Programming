import java.util.Scanner;

class Same {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		String res = checkEqualsNumber(x, y);
		System.out.println(res + " number");
		sc.close();
	}

	public static String checkEqualsNumber(int x, int y) {
		String res = (x == y) ? "Same" : "Not Same";
		return res;
	}
}