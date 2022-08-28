package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _14928 {
    static void sol(String str){
        int result = 0;
        for(int i=0; i<str.length(); i++){
            result = (result*10 + Integer.parseInt(str.charAt(i)+""))%20000303;
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        sol(str);
    }
}