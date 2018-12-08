import java.util.*;
public class PE
{
	public static void main(String  argsp[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		double m=s.nextDouble();
		double ng=m,a=0.0;
		for(int x=0;x<(n<<1);x++)
		{
			int aa=s.nextInt();
			if(aa==1)
			{
				System.out.println(-1);
				System.exit(0);
			}
			ng/=(1.0d-1.0d/(double)(aa));
		}
		System.out.println(ng-m);
	}
}	