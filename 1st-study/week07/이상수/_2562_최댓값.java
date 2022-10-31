package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2562_최댓값 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int idx = 1;
        for(int i=0; i<9; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(max < tmp){
                max = tmp;
                idx = i+1;
            }
        }
        System.out.println(String.format("%d\n%d",max,idx));
    }
}
