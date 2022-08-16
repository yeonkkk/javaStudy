package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2588_곱셈 {
    static void sol(int first, int second){
        int result = 0;
        int digit = 1;
        while(second!=0){
            int tmp = second%10;
            System.out.println(first*tmp);
            result += first*tmp*digit;
            digit *= 10;
            second /= 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st1.nextToken());

        sol(first,second);
    }
}
