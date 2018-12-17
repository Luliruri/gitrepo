import java.util.*;
public class Replacement{
    public static void (String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next(), rep = s.replaceAll("1", ""), one = s.replaceAll("0", "").replaceAll("2", "");
        int index = rep.indexOf("2");
        if (index >= 0) System.out.print(rep.substring(0, index) + one + rep.substring(index));{
			
		}else {
			System.out.println(rep + one);
		}
    }
}