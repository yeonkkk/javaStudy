// 두 수 비교하기
import java.io.*;
import java.util.StringTokenizer;

public class BJ1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        String result = "==";

        if (a > b) result = ">";
        else if (a < b) result = "<";

        bw.write(result);
        br.close();
        bw.close();
    }
}
