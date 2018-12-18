import java.util.*;
import java.io.*;
public class ChessBoard {
	public static void main(String[] args) {
		PrintWriter print=new PrintWriter(System.out);
		Scanner scan=new Scanner(System.in);
		long square=scan.nextLong();
		int num=scan.nextInt();
		int angleA,AngleB;
		long add=(sq * sq + 1)/2,res;
		for(int i=0;i<num;i++){
			A=scan.nextInt();B=scan.nextInt();
			res = ((a-1)*sq+b+1)/2;
			if((a+b)%2!=0)res+=add;
			print.println(res);
		}
		print.flush();
	}
}