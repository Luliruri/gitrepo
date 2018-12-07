import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int hold =0;
		for(int i=0;i<a;i++){
		    int x=scan.nextInt();
		    int y=scan.nextInt();
		    if(x+y>hold){
		        hold=x+y;
		        }
		    }
			System.out.println(hold);
		}
		
	}