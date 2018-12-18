import java.util.*;
public class VasayaCornfield{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        long rect_area = 2 * d * (n-d);
        int m = sc.nextInt();
        while(m-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            long area = ta(a, b, 0, d, d, 0) + ta(a, b, 0, d, n-d, n) + ta(a, b, d, 0, n, n-d) + ta(a, b, n, n-d, n-d, n);
            // System.out.println("rectA = "+rect_area + " a = "+area);
            if(area == (2*rect_area)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static long ta(int x1, int y1, int x2, int y2, int x3, int y3){
        long a = x1 * (y2 - y3);
        long b = y1 * (x2 - x3);
        long c = (x2 * y3) - (y2 * x3);
        long area = Math.abs(a - b + c);
        return area;
    }
}