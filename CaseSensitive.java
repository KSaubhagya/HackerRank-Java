import java.util.Scanner;

public class Solution {

   public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i=0;i<a.length();i++){
            b= b.replaceFirst(String.valueOf(a.charAt(i)), "");
            
        }
        return (b.equals("")) ?  true :  false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagram" );
    }
}
