package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9468_시험성적 {
    static void sol(int N){
        if (N>=90 && N<=100){
            System.out.println("A");
        }
        else if (N>=80 && N<90){
            System.out.println("B");
        }
        else if (N>=70 && N<80){
            System.out.println("C");
        }
        else if (N>=60 && N<70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        sol(N);
    }
}
