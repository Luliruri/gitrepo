import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String a,b;
        
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        b = in.nextLine();
        int i=a.length()-1, j=b.length()-1, ans=0;
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        while(i>=0 && j>=0){
            if(arrayA[i--]==arrayB[j--]) ans++;
            else break;;
        }
        System.out.println(a.length()+b.length()-2*ans);
    }
}
