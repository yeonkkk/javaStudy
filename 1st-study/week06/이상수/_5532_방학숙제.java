package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _5532_방학숙제 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] result = new String[5];
        StringTokenizer st;
        for(int i=0; i<5; i++){
            result[i] = br.readLine();
        }
        int math = (int)Math.ceil(Double.parseDouble(result[1])/(Double.parseDouble(result[3])));
        int kor = (int)Math.ceil(Double.parseDouble(result[2])/(Double.parseDouble(result[4])));

        int remain = Integer.parseInt(result[0])-Math.max(math,kor);
        bw.write(String.valueOf(remain));
        bw.flush();
        bw.close();
    }
}
