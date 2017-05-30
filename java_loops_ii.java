import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();//adder
            int b = in.nextInt();//multiplier
            int n = in.nextInt();//series length
            int total = a;
            for(int j = 0; j < n;j++){
                total += b * (Math.pow(2,j));
                System.out.printf("%d ",total);
            }
            System.out.printf("\n");
        }
        in.close();
    }
}