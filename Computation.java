import java.io.*;
import java.util.Map;
public class Computation {

    private static BufferedReader br;
    private static StreamTokenizer st;
    private static PrintWriter pw;

    static final int INF = 1000000007;
    static final int MOD = 1000000007;

    private static void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        long l = nextInt();
        long a[] = new long[n + 1];
        boolean large[] = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = nextInt();
            if (a[i] > l) {
                large[i] = true;
            }
        }
        int cnt = 0;
        int idx = 1;
        while (idx <= n) {
            while (idx <= n && !large[idx]) {
                idx++;
            }
            if (idx++ <= n) {
                cnt++;
            }
            while (idx <= n && large[idx]) {
                idx++;
            }
        }
        nextLine();
        while (m-- > 0) {
            String ss[] = nextSS(" ");
            int op = Integer.parseInt(ss[0]);
            if (op == 0) {
                pw.println(cnt);
            } else {
                int p = Integer.parseInt(ss[1]);
                long d = Long.parseLong(ss[2]);
                a[p] += d;
                if (a[p] > l && !large[p]) {
                    large[p] = true;
                    if (n == 1) {
                        cnt++;
                        continue;
                    }
                    if (p > 1 && p < n) {
                        if (!large[p - 1] && !large[p + 1]) {
                            cnt++;
                        } else if (large[p - 1] && large[p + 1]) {
                            cnt--;
                        }
                    } else if (p == 1 && !large[p + 1] || p == n && !large[p - 1]) {
                        cnt++;
                    }
                }
            }
        }
    }

    static void getDiv(Map<Integer, Integer> map, int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i >= 2; i--) {
            if (n % i == 0) {
                getDiv(map, i);
                getDiv(map, n / i);
                return;
            }
        }
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    public static boolean[] generatePrime(int n) {
        boolean p[] = new boolean[n + 1];
        p[2] = true;

        for (int i = 3; i <= n; i += 2) {
            p[i] = true;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (!p[i]) {
                continue;
            }
            for (int j = i * i; j <= n; j += i << 1) {
                p[j] = false;
            }
        }
        return p;
    }

    static boolean isPrime(long n) { //determines if n is a prime number
        int p[] = {2, 3, 5, 233, 331};
        int pn = p.length;
        long s = 0, t = n - 1;//n - 1 = 2^s * t
        while ((t & 1) == 0) {
            t >>= 1;
            ++s;
        }
        for (int i = 0; i < pn; ++i) {
            if (n == p[i]) {
                return true;
            }
            long pt = pow(p[i], t, n);
            for (int j = 0; j < s; ++j) {
                long cur = llMod(pt, pt, n);
                if (cur == 1 && pt != 1 && pt != n - 1) {
                    return false;
                }
                pt = cur;
            }
            if (pt != 1) {
                return false;
            }
        }
        return true;
    }

    static long llMod(long a, long b, long mod) {
        return (a * b - (long) ((double) a / mod * b + 0.5) * mod + mod) % mod;

    }

    static int pow(long a, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (ans * a) % MOD;
            }
            a = (a * a) % MOD;
            n >>= 1;
        }
        return (int) ans;
    }

    static int pow(long a, long n, long mod) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = llMod(ans, a, mod);
            }
            a = llMod(a, a, mod);
            n >>= 1;
        }
        return (int) ans;
    }

    private static long[][] initC(int n) {
        long c[][] = new long[n][n];

        for (int i = 0; i < n; i++) {
            c[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
            }
        }
        return c;
    }

    private static int c(long n, long m) {
        if (m > n) {
            n ^= m;
            m ^= n;
            n ^= m;
        }
        m = Math.min(m, n - m);

        long top = 1;
        long bot = 1;
        for (long i = n - m + 1; i <= n; i++) {
            top = (top * i) % MOD;
        }
        for (int i = 1; i <= m; i++) {
            bot = (bot * i) % MOD;
        }

        return (int) ((top * pow(bot, MOD - 2)) % MOD);
    }

    static int gcd(int a, int b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static boolean even(long n) {
        return (n & 1) == 0;
    }

    public static void main(String args[]) throws IOException {
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        if (!oj) {
            System.setIn(new FileInputStream("in.txt"));
	/**System.setOut(new PrintStream("out.txt"));*/
        }
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        st.ordinaryChar('\''); 
        st.ordinaryChar('\"');
        st.ordinaryChar('/');

        long t = System.currentTimeMillis();
        solve();
        if (!oj) {
            pw.println("[" + (System.currentTimeMillis() - t) + "ms]");
        }
        pw.flush();
    }

    private static long[] anLong(int n) throws IOException {
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    private static String next(int len) throws IOException {
        st.nextToken();
        return st.sval;
    }

    private static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(nextLine());
    }

    private static double nextDouble() throws IOException {
        st.nextToken();
        return st.nval;
    }

    private static String[] nextSS(String reg) throws IOException {
        return br.readLine().split(reg);
    }

    private static String nextLine() throws IOException {
        return br.readLine();
    }
}