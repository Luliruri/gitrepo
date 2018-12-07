import java.util.Scanner;

public class LostArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n + 1];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        int[] diff = new int[array.length - 1];

        for (int i = 0; i < diff.length; i++) {
            diff[i] = array[i + 1] - array[i];
        }
        int count = 0;
        int index = 0;
        int length = 1;
        int[] lengths = new int[diff.length];
        // System.out.println(diff.length);
        while (length < diff.length) {
            while (index + length < diff.length) {


                if ((index + length == diff.length - 1) & (diff[index] == diff[index + length])) {
                    lengths[count] = length;
                    count++;
                    // length++;
                    // System.out.println("here");
                    // System.out.println("count" + count);
                    // System.out.println("length" + length);
                    // System.out.println("index" + index);
                }
                if (diff[index] == diff[index + length]) {
                    index++;
                } else {
                    // length++;
                    break;
                }
            }
            length++;
            // System.out.println("l" + length);
            index = 0;
        }
        System.out.println(count + 1);
        // for (int i = 0; i < n; i++) {
        // System.out.print(diff[i] + " ");
        // }
        for (int i = 0; i < count; i++) {
            System.out.print(lengths[i] + " ");
        }
        System.out.print(diff.length);


    }
}
