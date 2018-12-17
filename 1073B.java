import java.io.PrintWriter;
import java.util.Scanner;

public class VasyaAndBooks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pr= new PrintWriter(System.out);
        int input = in.nextInt();
        int[] indexes = new int[n];
        for (int i = 0; i < input; i++) {
            int input1 = in.nextInt() - 1;
            indexes[input1] = i;
        }

        int start = 0;
        for (int i = 0; i < input; i++) {
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