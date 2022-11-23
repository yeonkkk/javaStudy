package season2;

import java.util.HashMap;
import java.util.Scanner;
/*
* don't need to consider 0 and 1
*/
public class Dial_5622 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputs = sc.nextLine();
        sc.close();
        System.out.println(dial(inputs));
    }

    public static Integer dial(String inputs) {

        HashMap<Character, Integer> map = new HashMap<>();
        int addon = 3;
        Integer sum = 0;

        // ASKII - CHAR ( A ~ Z )
        for (int i=65; i<=90;i++) {
            // if a single Char from given String inputs equals as below,
            // 1sec will be added. (addon)
            if((char)i == 'D' || (char)i =='G' || (char)i =='J' || (char)i =='M' ||
                    (char)i =='P' || (char)i =='T' || (char)i =='W'){
                addon++;
            }
            map.put((char)i, addon); // make it as HashMap
        }
        // if the single Char from given String: inputs matches a key,
        // value will be added to sum as time consumed.
        for(int i=0; i<inputs.length(); i++) {
            sum += map.get(inputs.charAt(i));
        }
        return sum;
    }
}
