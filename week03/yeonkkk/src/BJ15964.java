// 이상한 기호
import java.io.*;
import java.util.StringTokenizer;

public class BJ15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        String result = String.valueOf((a + b) * (a - b));
        bw.write(result);
        br.close();
        bw.close();
    }
}