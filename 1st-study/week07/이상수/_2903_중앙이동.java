package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2903_중앙이동{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int result = (int)Math.pow((Math.pow(2,num)+1),2);
        System.out.println(result);
    }
}