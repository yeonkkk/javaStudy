package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17362_수학은_체육과목_입니다2 {
    static void sol(Long n){
        long remain = (n-1)%8;
        if (remain < 5) {
            System.out.println(remain+1);
        }else if(remain == 5){
            System.out.println(4);
        }else if(remain == 6){
            System.out.println(3);
        }else{
            System.out.println(2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long first = Long.valueOf(br.readLine().split(" ")[0]);
        sol(first);
    }
}
