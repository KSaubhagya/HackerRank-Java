import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US); //creates a NumberFormat object that formats numbers as currency according to the US locale (built in func)
        String us = n1.format(payment);// formats the value of payment

        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en","IN")); //India does not have a built-in Locale, so you must construct one where the language is en
        String india = n2.format(payment);  //creates a custom locale for India. Here, "en" represents English as the language, and "IN" represents India

        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n3.format(payment);

        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        String france = n4.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
