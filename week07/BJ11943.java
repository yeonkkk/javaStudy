// 파일 옮기기

import java.io.*;
import java.util.Arrays;

public class BJ11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bw.write("" + Math.min(arr[0] + arr2[1], arr[1] + arr2[0]));

        br.close();
        bw.close();
    }
}
