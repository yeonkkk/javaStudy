package week1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _1550_진수_16 {
        static void trans(String hex) {
        String number = "[0-9]";
        String str = "[A-F]";
        int result = 0;
        StringBuffer sb = new StringBuffer(hex);
        hex = sb.reverse().toString();

        for (int i = 0; i < hex.length(); i++) {
            String tmp = String.valueOf(hex.charAt(i));
            if (Pattern.matches(number, tmp)) {
                result += Math.pow(16, i) * ((Integer) (Integer.valueOf(tmp)));
            } else if (Pattern.matches(str, tmp)) {
                result += Math.pow(16, i) * ((Integer) (10 + Integer.valueOf(tmp.charAt(0)) - Integer.valueOf('A')));
            }
        }

        System.out.println(result);
    }
//=============================================================
//    static void trans(String hex){
//        System.out.println(Integer.parseInt(hex,16));
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.next();
        trans(hex);
    }
}
