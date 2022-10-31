package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _2530_인공지능시계 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] now = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt)
                .toArray(Integer[]::new);
        Integer flow = Integer.parseInt(br.readLine());

        String[] result = new String[3];

        for(int i=2; i>=0 ;i--){
            if(i==2) now[i] += flow;

            if(i != 0){
                now[i-1] += now[i]/60;
                now[i] %= 60;

            }else{
                now[i] %= 24;
            }
            result[i] = String.valueOf(now[i]);
        }

        for(int i=0; i<=2 ;i++){
            bw.write(result[i]);
            if(i != 2) bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
