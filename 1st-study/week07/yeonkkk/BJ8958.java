// OX 퀴즈
import java.io.*;

public class BJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) bw.write(String.format("%d%n", calculator(br.readLine())));

        br.close();
        bw.close();
    }

    public static int calculator(String str) {
        int totalScore = 0;
        int curScore = 0;

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);

            if(cur == 'O') totalScore += ++curScore;
            else curScore = 0;
        }
        return totalScore;
    }
}
