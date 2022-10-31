package week8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _2775_부녀회장 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());

        for(int i=0; i<repeat; i++){
            bw.write(cal(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())) + "\n");
        }

        bw.flush();
        bw.close();
    }

    static int cal(int floor, int ho){
        int[] prev = new int[ho+1];
        int[] pres = new int[ho+1];
        for(int i=1; i<=ho; i++) prev[i] = i;

        for(int i=1; i<=floor; i++){
            for(int j=1; j<=ho; j++){
                int sum = Arrays.stream(Arrays.copyOfRange(prev,1,j+1)).sum();
                pres[j] = sum;
            }
            prev = Arrays.copyOfRange(pres,0,pres.length);
        }

        return prev[ho];
    }
}
