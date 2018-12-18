import java.util.*;


public class Ksenia{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s;
		ArrayList<String> al = new ArrayList<>();
		int n = sc.nextInt();
		for(int i = 0;i<n;i++){
			s=sc.next();
			al.add(s);
		}
		for(int i=0;i<n;i++){
			s = sc.next();
			if(al.contains(s)) al.remove(s);
		}
		System.out.print(al.size());
	}
}