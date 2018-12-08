import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(1);
			System.out.flush();
			int a = s.nextInt();
			if (a == 0) {
				return;
			}
			p[i] = a;
		}
		int l = 1;
		int r = m + 1;
		int i = 0;
		while(r - l > 1) {
			int mm = l + r >>> 1;
			System.out.println(mm);
			System.out.flush();
			int a = s.nextInt() * p[i];
			i = (i + 1) % n;
			if (a == 0) {
				return;
			} else if (a == -1) {
				r = mm;
			} else {
				l = mm;
			}
		}
	}
}