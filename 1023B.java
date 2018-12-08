


Problem 1023B - Pair of Toys

 import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a < b - 1) {
			b -= (2*((b-1)-a));
		}
		System.out.println(Math.max((b - 1) / 2, 0));
		
	}
}








