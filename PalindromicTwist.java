/*1027A- Palindrome Twist*/
import java.util.Scanner;

public class PalindromicTwist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strings = sc.nextInt();
		boolean pal = true;
		while(strings > 0){
			int length = sc.nextInt();
			String s = sc.next();
			pal = true;
			for(int i = 0; i < length/2; i++){
				if(s.charAt(i) != s.charAt(length - i - 1)){
					if(s.charAt(length - i - 1) - s.charAt(i) == 2 || s.charAt(length - i - 1) - s.charAt(i) == -2){
						continue;
					}
					else {
						pal = false;
						break;
					}
				}
			}
			System.out.println(pal? "YES" : "NO");
			strings--;
		}
		sc.close();
	}
}