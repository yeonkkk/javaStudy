package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class _1247_부호 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        BigInteger result;

        for(int i=0; i<3; i++){
            result = new BigInteger("0");
            st = new StringTokenizer(br.readLine());
            Integer num = Integer.parseInt(st.nextToken());
            for(int j=0; j<num; j++){
                result = result.add(new BigInteger(br.readLine()));
            }
            if(result.toString().equals("0")){
                System.out.println("0");
            }else if(result.compareTo(new BigInteger("0")) > 0){
                System.out.println("+");
            }else{
                System.out.println("-");
            }
        }
    }
}
