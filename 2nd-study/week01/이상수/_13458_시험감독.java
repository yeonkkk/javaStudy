package week8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _13458_시험감독 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        int[] per = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] viewer = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long result = total;

        for(int i=0; i<total; i++){
            int remain = per[i]-viewer[0];
            if(remain > 0){
                int add = remain%viewer[1] == 0 ? remain/viewer[1] : remain/viewer[1]+1;
                result += add;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
