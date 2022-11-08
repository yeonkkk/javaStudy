package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14681_사분면_고르기 {
    static void sol(int first, int second){
        int show = first > 0 ? (second > 0 ? 1 : 4) : (second > 0 ? 2 : 3);
        System.out.println(show);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        sol(Integer.valueOf(st.nextToken()),Integer.valueOf(st1.nextToken()));
    }
}
