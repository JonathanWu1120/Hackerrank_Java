import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%s",s1);
                for(int j = 0; j < 15 - s1.length(); j++){
                    System.out.printf(" ");
                }
                if(x < 10){ 
                    System.out.printf("00%d\n",x);
                }
                else{
                    if(x < 100){
                        System.out.printf("0%d\n",x);
                    }
                    else{
                        System.out.printf("%d\n",x);
                    }
                }
            }
            System.out.println("================================");

    }
}
