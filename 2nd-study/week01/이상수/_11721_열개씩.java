package week8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11721_열개씩 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());

        while(sb.length() != 0){
            String tmp = sb.length() >= 10 ? sb.substring(0,10) : sb.substring(0,sb.length());
            bw.write(tmp + "\n");
            sb.replace(0,tmp.length(),"");
        }

        bw.flush();
        bw.close();
    }
}
