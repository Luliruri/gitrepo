import java.util.*;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] $) {
        int n = s.nextInt(), k = s.nextInt();
        int[] c = new int[k];
        s.next().chars().forEach(i - > ++c[i - 'A']);
        System.out.println(Arrays.stream(c).min().getAsInt() * k);
    }
}