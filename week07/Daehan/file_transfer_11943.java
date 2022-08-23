package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class file_transfer_11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String temp = bf.readLine();
        String temp1 = bf.readLine();
        StringTokenizer tk = new StringTokenizer(temp +" " + temp1);

        int first_apple = Integer.parseInt(tk.nextToken());
        int first_orange = Integer.parseInt(tk.nextToken());
        int second_apple = Integer.parseInt(tk.nextToken());
        int second_orange = Integer.parseInt(tk.nextToken());

        //first basket -> second basket
        //second basket -> first basket
        //find min attempts

        int firstToSecond = first_apple + second_orange;
        int secondToFirst = second_apple + first_orange;

        System.out.println(Math.min(firstToSecond, secondToFirst));
    }
}
