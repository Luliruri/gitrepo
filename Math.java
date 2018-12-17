import java.util.Scanner;

public class Math {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int h =sc.nextInt();
		int a =sc.nextInt();
		int b =sc.nextInt();
		int q =sc.nextInt();
		for (int i = q; i>0; i--) {
			int t1 =sc.nextInt();
			int f1 =sc.nextInt();
			int t2 =sc.nextInt();
			int f2 =sc.nextInt();
				if(t1==t2)System.out.println((int)Math.abs(f1-f2));
				else if (f1>=a&&f1<=b)
					System.out.println(Math.abs(f1-f2)+Math.abs(t1-t2));
				else {
					System.out.println((int)(Math.abs(f1<a?f1-a:f1-b)+Math.abs(t1-t2)+Math.abs((f1<a?a:b)-f2)));
				}
		}
	}
}