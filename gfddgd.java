import java.util.*;
public class gfddgd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	int sum=0;
	for(int i=0;i<n;i++) {
		int a=sc.nextInt();
		sum+=a;
		System.out.print(sum/m+" ");
		sum=sum%m;
		
	}
	
}