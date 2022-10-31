package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10179_쿠폰 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer per ;

        int repeat = Integer.parseInt(st.nextToken());
        for(int i=0; i<repeat; i++){
            per = new StringTokenizer(br.readLine());
            double number = Double.parseDouble(per.nextToken());
            bw.write(String.format("$%.2f\n",number/100*80));
//            bw.write("$"+Math.round(number*100*80/100)/100.0+"\n");
        }

        bw.flush();
        bw.close();
    }
}
