package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _3029_경고 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] now = Arrays.stream(br.readLine().split(":")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] time = Arrays.stream(br.readLine().split(":")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] result = new Integer[3];

        for(int i=2; i>=0 ; i--){
            if(i != 0){
                if(now[i] > time[i]){
                    result[i] = time[i] + (60-now[i]);
                    now[i-1] += 1;
                }else{
                    result[i] = time[i] - now[i];
                }
            }

            if(i ==0){
                if(now[i] > time[i]){
                    result[i] = time[i] + (24-now[i]);
                }else{
                    result[i] = time[i] - now[i];
                }
            }
        }
        if(result[0] == 0 && result[1] == 0 && result[2] == 0){
            bw.write("24:00:00");
        }else{
            for(int i=0; i<=2 ;i++){
                if(String.valueOf(result[i]).length() == 2){
                    bw.write(result[i]+"");
                }else{
                    bw.write("0"+result[i]);
                }

                if(i != 2){
                    bw.write(":");
                }
            }
        }



        bw.flush();
        bw.close();

    }
}


//00:00:00 -> 24시간 으로