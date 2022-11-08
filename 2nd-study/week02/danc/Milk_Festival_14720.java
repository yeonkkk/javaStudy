package season2;

import java.io.*;
import java.util.StringTokenizer;

public class Milk_Festival_14720 {

    public static int milk(int[] arr){
        int idx = 0;
        int count = 0;
        for(int i=0; i< arr.length; i++) {

            if(idx == 3) idx = 0;

            if(arr[i] == idx){
                count++;
                idx++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfStalls = Integer.parseInt(br.readLine());
        int[] arr = new int[numOfStalls];
        StringTokenizer tk = new StringTokenizer(br.readLine());

        for(int i=0; i<numOfStalls; i++){
            arr[i] = Integer.parseInt(tk.nextToken());
        }

        br.close();
        bw.write(String.valueOf(milk(arr)));
        bw.flush();
        bw.close();
    }
}
