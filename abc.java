
import java.util.Scanner;

public class abc {
	static Scanner tt;
	public static void main(String[] args) {
		tt=new Scanner(System.in);
		int n=tt.nextInt();
		for(int i=0;i<n;i++) {
			int a=tt.nextInt();
			if(a%2==0)a--;
			System.out.print(a+" ");
		}
	}

}