import java.util.*;

public class Television {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long k = 0;
        long g = gcd(x,y);
        x /= g;
	y /= g;
        System.out.println(Math.min(a/x, b/y));
    }
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
