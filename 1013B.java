1013B
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Set;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class 1013B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BAnd solver = new BAnd();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAnd {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a);
            Set<Integer> u = new HashSet<>();
            boolean o = false;
            for (int i = 0; i < n; i++) {
                if (u.contains(a[i])) {
                    out.println("0");
                    return;
                }
                if (u.contains(a[i] & x)) o = true;
                u.add(a[i]);
            }
            if (o) {
                out.println(1);
                return;
            }
            Set<Integer> v = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (v.contains(a[i] & x)) {
                    out.println(2);
                    return;
                }
                v.add(a[i] & x);
            }
            out.print(-1);
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

    }
}