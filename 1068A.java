import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		long n
		long m
		long k
		long l;
		n = scan.nextLong();
		m = scan.nextLong();
		k = scan.nextLong();
		l = scan.nextLong();
		
		long temp = k + l;
		long need = temp / m;
		if (temp % m != 0) {
			need ++;
		}
		if (need * m <= n) {
			System.out.println(need);
		} else {
			System.out.println(- 1);
		}
		
	}
	
}