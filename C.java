/*1029C- Maximal Intersection*/

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

public class C {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Solver solver = new Solver();
        solver.solve(1, in, out);

        out.close();
    }

    static class Solver {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int min1 = Integer.MAX_VALUE; // min1 <= min2
            int min2 = Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE; // max1 >= max2
            int max2 = Integer.MIN_VALUE;
            int[] l = new int[n];
            int[] r = new int[n];
            for (int i = 0 ; i < n ; i++) {
                l[i] = in.nextInt();
                r[i] = in.nextInt();
                if (l[i] >= max1) {
                    max2 = max1;
                    max1 = l[i];
                } else if (l[i] >= max2) {
                    max2 = l[i];
                }
                if (r[i] <= min1) {
                    min2 = min1;
                    min1 = r[i];
                } else if (r[i] <= min2) {
                    min2 = r[i];
                }
            }
            int maxLen = 0;
            for (int i = 0 ; i < n ; i++) {
                int _l = max1;
                if (l[i] == max1) _l = max2;
                int _r = min1;
                if (r[i] == min1) _r = min2;
                maxLen = Math.max(maxLen, _r - _l);
            }
            out.println(maxLen);
        }

    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }
    }
}








