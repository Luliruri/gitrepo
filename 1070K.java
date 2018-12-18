import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class forBuff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split("\\s+");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        s = reader.readLine().split("\\s+");
        int [] a = new int[n];
        int summ = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
            summ += a[i];
        }
        boolean isPos = true;
        if (summ % k != 0){
            System.out.println("No");
        } else {
            int curr = 0;
            int ans = 0;
            int ex = summ / k;
            ArrayList list = new ArrayList();
            for (int i = 0; i < n; i++){
                curr += a[i];
                if (curr > ex){
                    System.out.println("No");
                    return;
                } else if (curr == ex) {
                    ans++;
                    curr = 0;
                    list.add(ans);
                    ans = 0;
                } else {
                    ans ++;
                }
            }
            if (curr != 0) {
                System.out.println("No");
                return;
            } else {

                System.out.println("Yes");
                for (int i = 0; i < list.size(); i++){
                    System.out.print(list.get(i)+" ");
                }
            }
        }

    }
}