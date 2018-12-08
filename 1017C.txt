Problem 1017C - The Phone Number
import java.util.Scanner;

public class C1017 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), i, j;
		int gap = (int) Math.sqrt(n);
		gap = (n + gap - 1) / gap;
		
		for(i = 0; i <= n; i += gap) 
			for(j = i + gap; j > i; --j)
				if(j <= n)
					System.out.print(j + " ");
	}
	
}
