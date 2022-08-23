package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _12873_기념품 {
    static void sol(int n){
        List<Integer> result = new ArrayList<>();
        int backjoon = 0;
        for(int i=1; i<=n; i++){
            result.add(i);
        }

        for(int i=0; i<n-1; i++){
            int remain = 1;
            for(int j=0; j<3; j++){
                remain = (remain*(i+1))%result.size();
            }
            int temp = (remain-1+backjoon+result.size())%result.size();
            result.remove(temp);
            backjoon = (temp) % result.size();
        }

        System.out.println(result.get(0));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "");

        Integer n = Integer.parseInt(st.nextToken());
        sol(n);
    }
}
