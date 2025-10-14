import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.close();
    Pattern p = Pattern.compile("[A-Za-z]+");
    Matcher m = p.matcher(s);

    List<String> tokens = new ArrayList<>();
    while (m.find()) {
        tokens.add(m.group());
    }

    System.out.println(tokens.size());
    for (String token : tokens) {
        System.out.println(token);
    }
}
}

