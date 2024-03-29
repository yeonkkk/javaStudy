// 손익분기점
import java.io.*;
import java.util.StringTokenizer;

public class BJ1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = c <= b ? -1 : a / (c - b) + 1;

        bw.write("" + result);
        br.close();
        bw.close();
    }
}
