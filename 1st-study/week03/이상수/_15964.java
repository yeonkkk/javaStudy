package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _15964 {
    static void sol(BigInteger first, BigInteger second){
        System.out.println(first.add(second).multiply(first.subtract(second)));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger first = new BigInteger(st.nextToken());
        BigInteger second = new BigInteger(st.nextToken());

        sol(first,second);
    }
}
