package week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class _2747_피보나치수 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer n = Integer.parseInt(br.readLine());

        int result = fibonacci(n,new ArrayList<>(List.of(0,1)));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    static int fibonacci(int n, List<Integer> list){
        if(n == 1 || n == 0) return n;

        while(list.size() != n+1){
            int len = list.size();
            list.add(list.get(len-1) + list.get(len-2));
        }

        return  list.get(n);
    }
}
