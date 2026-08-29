
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String command = sc.next();

            if (command.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (command.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
        sc.close();
    }
    
}
