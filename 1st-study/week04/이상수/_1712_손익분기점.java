package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _1712_손익분기점 {
    static void sol(BigInteger fixed, BigInteger trans, BigInteger notebook){
        if(trans.subtract(notebook).longValue() >= 0){
            System.out.println(-1);
        }else{
            BigInteger tmp = notebook.subtract(trans);
            long show = fixed.divide(tmp).longValue();
            System.out.println(show+1);
        }
    }


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        BigInteger first = new BigInteger(str[0]);
        BigInteger second = new BigInteger(str[1]);
        BigInteger third = new BigInteger(str[2]);

        sol(first,second,third);
    }
}
