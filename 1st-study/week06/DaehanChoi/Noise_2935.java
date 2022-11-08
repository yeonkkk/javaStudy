package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Noise_2935 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(bf.readLine());
        String operator = bf.readLine();
        BigInteger B = new BigInteger(bf.readLine());
        bf.close();


        switch (operator) {
            case "+":
                System.out.println(A.add(B));
                break;
            case "*":
                System.out.println(A.multiply(B));
                break;
        }
    }
}
