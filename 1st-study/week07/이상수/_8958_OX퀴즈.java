package week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _8958_OX퀴즈 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int recur = Integer.parseInt(br.readLine());

        for(int i=0; i<recur; i++){
            String[] arr = br.readLine().split("");
            int total =0;
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j].equals("O")){
                    count +=1;
                    total += count;
                }else{
                    count=0;
                }
            }
            bw.write(total+"\n");
        }

        bw.flush();
        bw.close();
    }
}
