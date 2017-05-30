import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int i = s.nextInt();
        for(int j = 1; j < 11; j++){
            System.out.printf("%d x %d = %d\n",i,j,i*j);
        }
    }
}