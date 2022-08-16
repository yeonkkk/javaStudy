package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1085_직사각형탈출 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] square = new int[4];
        int idx =0;

        while(st.hasMoreTokens()){
            square[idx++] = Integer.parseInt(st.nextToken());
        }

        int x = square[0] - 0 < square[2]-square[0] ? square[0]-0 : square[2] - square[0];
        int y = square[1] - 0 < square[3]-square[1] ? square[1]-0 : square[3] - square[1];

        bw.write(Math.min(x,y) + "");
        bw.flush();
        bw.close();
    }
}
