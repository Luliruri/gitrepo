import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n], l = new int[n];
		for (int i = 0; i < n; i ++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(l);
		Arrays.sort(r);
		long result = 0;
		for (int i = 0; i < n; i ++) result += Math.max(l[i], r[i]);
		System.out.println(result + n);
	}
}