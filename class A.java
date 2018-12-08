import java.util.*;
public final class A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 3 == 2) System.out.println("1 2 " + (n - 3));
		else System.out.println("1 1 " + (n - 2));
	}
}