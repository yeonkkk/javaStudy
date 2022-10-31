package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _11943_파일옮기기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        int apple_R = Integer.parseInt(first[0])+Integer.parseInt(second[1]);
        int apple_L = Integer.parseInt(first[1])+Integer.parseInt(second[0]);

        int min = apple_R > apple_L ? apple_L : apple_R;
        System.out.println(min);
    }
}
