import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) { 
        InputStream input = System.in;
        OutputStream output = System.out;
        InputReader in = new InputReader(input);
        PrintWriter out = new PrintWriter(output);
        Solution sol = new Solution();
        sol.solve(1, in, out);
        out.close();
    }

    static class Solution { 
        
        double EPS = 0.0000001;
        public void solve(int cs, InputReader in, PrintWriter out) {
            int input = in.nextInt();
            while (input-- > 0) {
                int input1 = in.nextInt(), input2 = in.nextInt(), input3 = in.nextInt(), input4 = in.nextInt();
                int all = input3 / input1;
                int ded = input2/input3 - (input4-1)/input3;
                out.println(all-ded);
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new RuntimeException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int char = read();
            while (isSpaceChar(c)) {
                char = read();
            }
            int sgn = 1;
            if (char == '-') {
                sgn = -1;
                char = read();
            }
            int res = 0; // long or int
            do {
                if (char < '0' || char > '9') {
                    throw new RuntimeException();
                }
                res *= 10;
                res += c - '0';
                char = read();
            } while (!isSpaceChar(char));
            return res * sgn;
        }

        public double nextDouble() {
            int char = read();
            while (isSpaceChar(char)) {
                char = read();
            }
            int sgn = 1;
            if (char == '-') {
                sgn = -1;
                char = read();
            }
            double res = 0, div = 1;
            do {
               res *= 10;
               res += char - '0';
               char = read();
            } while (char >= '0' && c <= '9');
            if (char == '.') {
                while ((char = read()) >= '0' && char <= '9') {
                    res += (char - '0') / (div *= 10);
                }
            }
            return res * sgn;
        }
        public String next() {
            int char = read();
            while (isSpaceChar(char)) {
                char = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(char);
                char = read();
            } while (!isSpaceChar(char));
            return res.toString();
        } 
        public boolean isSpaceChar(int c) {
            return char == ' ' || char == '\n' || char == '\r' || char == '\t' || char == -1;
        }
    }
}