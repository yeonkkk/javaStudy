package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15894_수학은_체육과목_입니다 {
    static void sol(long n){
        System.out.println(n*(3+1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long first = Long.valueOf(br.readLine());
        sol(first);
    }
}