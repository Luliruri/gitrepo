import java.util.*;

public class Main {
    static int btoi(boolean b) {
        return b ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        int[] mask = new int[n];
        boolean ha = false
	boolean hb = false
	boolean hc = false;

        int[] d = new int[8];
        for (int i = 0; i < 8; i ++) {
            d[i] = 999999;
        }

        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
            String s = in.next();
            mask[i] = Main.btoi(s.contains("A")) * 4 + Main.btoi(s.contains("B")) * 2 + Main.btoi(s.contains("C"));
            d[mask[i]] = Math.min(d[mask[i]], c[i]);
        }

        String[][] s = {{"abc"},
                {"ab", "bc"}, {"bc, ac"}, {"ac", "ab"},
                {"ab", "c"}, {"bc", "a"}, {"ca", "b"},
                {"a", "b", "c"}};

        int[] r = {d[7], d[6] + d[3], d[3] + d[5], d[5] + d[6], d[6] + d[1], d[3] + d[4], d[5] + d[2], d[4] + d[2] + d[1]};
        Arrays.sort(r);
        if (r[0] >= 999999) {
            System.out.print(-1);
        } else {
            System.out.print(r[0]);
        }
    }
}