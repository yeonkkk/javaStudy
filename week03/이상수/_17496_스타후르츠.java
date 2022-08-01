package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17496_스타후르츠 {
    static void sol(int N, int T, int C, int P){
        int cat = (N-1)/T;
        System.out.println(cat*C*P);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        sol(Integer.valueOf(temp[0]),Integer.valueOf(temp[1]),Integer.valueOf(temp[2]),Integer.valueOf(temp[3]));
    }
}


//    첫 번째 줄에 여름의 일 수 N (2 ≤ N ≤ 90) 과
//    스타후르츠가 자라는데 걸리는 일 수 T (1 ≤ T ≤ N-1) 와 스타후르츠를
//    심을 수 있는 칸의 수 C (1 ≤ C ≤ 300) 와 스타후르츠 개당 가격
//    정수 P (1 ≤ P ≤ 1,000) 가 주어집니다.