import java.util.Scanner;
class EqualNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(x == y)
		    System.out.println(x+" is equal to "+y);
		if(x != y)
		    System.out.println(x+" is not equal to "+y);	
		
		}
	}