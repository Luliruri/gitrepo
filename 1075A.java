import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),x=sc.nextLong(),y=sc.nextLong();
        System.out.println(((x+y-2)<=(n+n-x-y))?"White":"Black");
    }
}