import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_10610 {
    public static void main(String[] args) throws IOException {
        /*
        boj_10610 30
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        char[] arr = n.toCharArray();
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        int sum = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            int num = arr[i] - '0';
            result.append(arr[i]);
            sum += num;
        }
        if(sum % 3 != 0 || arr[0] != '0') {
            System.out.println(-1);
            return;
        }
        System.out.println(result);
    }
}