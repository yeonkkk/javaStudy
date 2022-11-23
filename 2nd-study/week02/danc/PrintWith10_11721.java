package season2;

import java.util.Scanner;

public class PrintWith10_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String ans = "";

        if(str.length() <= 10) {
            System.out.println(str);
        }
        else {
            int idx = 0;

            while (true) {

                if(ans.length() == 10) {
                    System.out.println(ans);
                    ans = "";
                }

                ans +=  Character.toString(str.charAt(idx));
                idx++;

                if(idx == str.length()){
                    System.out.println(ans);
                    break;
                }
            }

        }
    }
}
