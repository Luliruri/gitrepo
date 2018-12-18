import java.util.ArrayList;
import java.util.Scanner;

public class AimROUnd_A {

	public static void main(String[] args) {
		/** TODO Auto-generated method stub */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		char[][] ch = new char[n][m];
		String str[] = new String[n];
		ArrayList<Integer> ll1 = new ArrayList<>();
		ArrayList<Integer> ll2 = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			str[i] = s.next();
			for (int j = 0; j < m; j++) {
				ch[i][j] = str[i].charAt(j);
				if (ch[i][j] == 'B') {
					ll1.add(i + 1);

					ll2.add(j + 1);

				}

			}
		}
		System.out.println(ll1.get(ll1.size() / 2) + " " + ll2.get(ll2.size() / 2));

	}

}