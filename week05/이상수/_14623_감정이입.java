package week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14623_감정이입 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        Long first = Long.parseLong(st.nextToken(),2);
        Long second = Long.parseLong(st1.nextToken(),2);

        String result = Long.toBinaryString(first*second);

        System.out.println(result);
    }
}

//Integer 범위 초과