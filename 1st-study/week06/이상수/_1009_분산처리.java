package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _1009_분산처리{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Integer num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int result = 1;
            for(int j=0; j<second; j++){
                result *= first;
                result %= 10;
            }
            if(result == 0){
                bw.write(10+"");
            }else{
                bw.write(result+"");
            }
            if(i != num-1){
                bw.write("\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
