import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            
         System.out.println((String.format("%-15s",s1))+""+String.format("%03d", x));    //format left align and 15 characters and 3 digits (fill with zeros)
        

        }
        System.out.println("================================");

}

}
