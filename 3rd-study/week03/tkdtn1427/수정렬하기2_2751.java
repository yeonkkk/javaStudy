package backJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// 실버 5
// 정렬
public class 수정렬하기2_2751 {
    static int[] dp1;
    static int[] dp2;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        dp1 = new int[1_000_001];
        dp2 = new int[1_000_001];

        for (int i = 0; i < repeat; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number >= 0){
                dp1[number] = 1;
            }else{
                dp2[-number] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i= dp2.length-1; i>0; i--){
            if(dp2[i] == 1) sb.append(-i).append("\n");
        }

        for(int i=0; i<dp1.length; i++){
            if(dp1[i] == 1) sb.append(i).append("\n");
        }
        System.out.println(sb.replace(sb.length()-1, sb.length(),"").toString());
    }
}