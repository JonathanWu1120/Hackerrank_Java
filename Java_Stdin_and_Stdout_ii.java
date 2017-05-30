import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); //Scans next integer
        double d = scan.nextDouble(); //Scans next double
        scan.nextLine(); //Moves scanner to next line
        String s = scan.nextLine(); //Scans next line and makes it into a string

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
