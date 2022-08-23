// 최댓값
import java.io.*;

public class BJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = 0;
        int idx = 0;

        for (int i = 1; i <= 9; i++) {
            int curNum = Integer.parseInt(br.readLine());
            if (maxNum < curNum) {
                maxNum = curNum;
                idx = i;
            }
        }

        bw.write(String.format("%d%n%d", maxNum, idx));

        br.close();
        bw.close();
    }
}
