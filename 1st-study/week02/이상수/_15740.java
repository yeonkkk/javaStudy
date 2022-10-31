package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _15740 {
    static void sol(BigInteger first, BigInteger second){
        System.out.println(first.add(second));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        String[] test = br.readLine().split(" ");

        BigInteger first = new BigInteger(st.nextToken());
        BigInteger second = new BigInteger(st.nextToken());

        sol(first,second);
    }
}
