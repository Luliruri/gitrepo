import java.util.Scanner;

public class Metro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int home = sc.nextInt() - 1;
		boolean[] forward = new boolean[num];
		boolean[] backward = new boolean[num];
		boolean switchAfterHouse = false;

		for (int i = 0; i < num; i++) {
			if (sc.nextInt() == 1) {
				forward[i] = true;
			}
		}
		for (int i = 0; i < num; i++) {
			if (sc.nextInt() == 1) {
				backward[i] = true;
				if (i > home && forward[i] && backward[home]) {
					switchAfterHouse = true;
					break;
				}
			}
		}

		if (forward[0] && (forward[home] || switchAfterHouse)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();

	}

}