package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Full_Deletion_9243 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String bits = bf.readLine();
        String bits_after_deletion = bf.readLine();
        bf.close();
        String ans = "";

        if (n % 2 == 0) {
            for (int i = 0; i < bits.length(); i++) {
                if (bits.charAt(i) != bits_after_deletion.charAt(i)) {
                    ans = "Deletion failed";
                    break;
                } else {
                    ans = "Deletion succeeded";
                }
            }
        } else { //홀수면 결과가 달라야한다
            for (int i = 0; i < bits.length(); i++) {
                if (bits.charAt(i) == bits_after_deletion.charAt(i)) {
                    ans = "Deletion failed";
                    break;
                } else {
                    ans = "Deletion succeeded";

                }
            }
        }
        System.out.println(ans);
    }
}

/*
package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Full_Deletion_9243 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String bits = bf.readLine();
        String bits_after_deletion = bf.readLine();
        bf.close();
        char[] ans = new char[bits.length()];
        StringBuilder finalAns = new StringBuilder();


        //char[] ans initializing with String bits
        for (int s = 0; s < bits.length(); s++) {
            ans[s] = bits.charAt(s);
        }


        //bits transform
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bits.length(); j++) {
                char bits_char = bits.charAt(j);

                if (bits_char == '0') {
                    ans[j] = '1';
                } else if (bits_char == '1') {
                    ans[j] = '0';
                }
            }
        }

        for (int q = 0; q < bits.length(); q++) {
            finalAns.append(ans[q]);
        }

        if (finalAns.toString().equals(bits_after_deletion)) {
            System.out.println("Deletion succeeded");
        } else {
            System.out.println("Deletion failed");
        }
    }
}
*/