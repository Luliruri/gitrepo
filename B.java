/*1017B- The Bits*/
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();

        long zeroOne = 0, oneZero = 0, zeros = 0, ones = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == '0' && b[i] == '0') {
                zeros++;
            } else if (a[i] == '0' && b[i] == '1') {
                zeroOne++;
            } else if (a[i] == '1' && b[i] == '0') {
                oneZero++;
            } else {
                ones++;
            }
        }

        long ans = zeros * ones + zeros * oneZero + oneZero * zeroOne;

        System.out.println(ans);
    }
}