import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Letter {

    public static void main(String args[])throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String c= br.readLine();
	if(c.matches("(.*)[aeioun]")) {
	    if(c.matches("(.*)[^aeioun][^aeiou](.*)")) System.out.println("NO");
	    else System.out.println("YES");
	} else System.out.println("NO");
    {
}
                System.out.println("Yes");
                for (int i = 0; i < list.size(); i++){
                    System.out.print(list.get(i)+" ");
                }
            }
        }

    }
}