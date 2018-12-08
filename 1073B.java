1073B - Vasya and Books

import java.io.PrintWriter;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pr= new PrintWriter(System.out);
        int n = in.nextInt();
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt() - 1;
            indexes[a] = i;
        }

        int start = 0;
        for (int i = 0; i < n; i++) {
            int b = in.nextInt() - 1;
            int idx = indexes[b] + 1 - start;
            if (idx < 0) {
                pr.print("0");
            } else {
                pr.print(idx);
                start += idx;
            }
            pr.print(" ");
        }
        pr.close();
    }
}