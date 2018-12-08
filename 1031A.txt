






Problem 1031A - Golden Plate

import java.util.*;

public class TestForHack {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int w = in.nextInt(), h = in.nextInt(), k = in.nextInt();
        System.out.println(2*k*(w+h-4*k+2));
    }
}