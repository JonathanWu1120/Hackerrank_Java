import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner n=new Scanner(System.in);
        String input;
        int counter = 1;
        while(n.hasNextLine()){
            input = n.nextLine();
            System.out.println(counter+" "+input);
            counter++;
        }
    }
}