import java.util.*;
public class talk{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int a[]=new int[3];
		for(i=0;i<3;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		if((a[0]+a[1])>a[2])
		System.out.println("0");
	else
		System.out.println(a[2]-a[0]-a[1]+1);
	}
}