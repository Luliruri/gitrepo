import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		long n , m , k , l;
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