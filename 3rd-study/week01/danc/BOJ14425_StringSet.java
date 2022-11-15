/*
Using Array will cause timeout.
USE HashMap
*/

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ14425_StringSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer tk;
        tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        int count = 0;

        for(int i=1; i<=N; i++) {
            map.put(br.readLine(), null);
        }
        for(int i=1; i<=M; i++){
            if(map.containsKey(br.readLine())) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
