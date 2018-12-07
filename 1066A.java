import java.util.Scanner;

public class VovaAndTrain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t=0; t<T; t++) {
            int dest = in.nextInt();
            int v = in.nextInt();
            int L = in.nextInt();
            int R = in.nextInt();
            int answer = dest/v - R/v + (L-1)/v;
            System.out.println(answer);
        }
    }

}