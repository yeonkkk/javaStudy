package 최대한;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MathIsPE_15894 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =
                new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        bf.close();
        System.out.println(n*4);
    }
}
/*
1 2 3  4  5
4 8 12 16 20*/
