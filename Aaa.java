import java.util.*;
public class Aaa {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		System.out.println((long)(Math.log(n)/Math.log(2))+1);
	}
}