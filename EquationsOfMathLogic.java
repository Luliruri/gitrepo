import java.util.Scanner;

public class EquationsOfMathLogic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			long a = in.nextLong();
			long count = 0;
			while(a>0) {
				if( (a & 1) == 1)
					count++;
				a >>= 1;
			}
			count = (1 << count);
			System.out.println(count);
		}
	}
}