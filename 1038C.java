import java.util.*;
import java.math.*;
import java.util.*;
public class name
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
			b[i]=s.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		int x=n-1,y=n-1;
		long counta=0;
		long countb=0;
		while(x>=0||y>=0) {
			if(y<0||(x>=0&&a[x]>b[y])) {
				counta+=a[x];
				x--;
			}
			else
				y--;
			if(x<0||(y>=0&&b[y]>a[x])) {
				countb+=b[y];
				y--;
			}
			else
				x--;
		}
		System.out.println(counta-countb);
	}
}