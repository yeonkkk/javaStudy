package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10162_전자레인지 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine().split(" ")[0]);
        if(x % 10 != 0){
            bw.write(-1+"");
        }else{
            bw.write(x/300+" ");
            x %= 300;
            bw.write(x/60+" ");
            x %= 60;
            bw.write(x/10+"");
        }
        bw.flush();
        bw.close();
    }
}
