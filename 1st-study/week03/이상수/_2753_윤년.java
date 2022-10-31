package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2753_윤년 {
    static void sol(int year){
        if(year%4 == 0 && (year%100 != 0 || year%400 == 0)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        sol(Integer.parseInt(st.nextToken()));
    }
}
