
import java.util.*;
import java.io.*;
public class CF1016A {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int ans = 0;
      for(int i = 0; i < n; i++) {
         int a = sc.nextInt();
         
         ans += a;
         System.out.print(ans/m + " ");
         ans %= m;
      }
   }
}