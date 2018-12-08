import java.util.*;
import java.io.*;
public class ChessBoard {
	public static void main(String[] args) {
		PrintWriter print=new PrintWriter(System.out);
		Scanner scan=new Scanner(System.in);
		long sq=scan.nextLong();
		int num=scan.nextInt();
		int a,b;
		long add=(sq * sq + 1)/2,res;
		for(int i=0;i<num;i++){
			a=scan.nextInt();b=scan.nextInt();
			res = ((a-1)*sq+b+1)/2;
			if((a+b)%2!=0)res+=add;
			print.println(res);
		}
		print.flush();
	}
