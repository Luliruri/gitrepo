import java.util.Scanner;

public class code1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		String a = scan.nextLine();
		String b = scan.nextLine();
		int idx = a.indexOf('*');
		boolean check = false;
		if (idx == -1) {
			if (a.equals(b))
				check = true;
		} else {
			String s1 = a.substring(0, idx), s2 = (idx == a.length() ? "" : a.substring(idx + 1, a.length()));
			if (b.startsWith(s1) && b.endsWith(s2) && s1.length() + s2.length() <= b.length())
				check = true;
		}
		System.out.println(check ? "YES" : "NO");
	}
}