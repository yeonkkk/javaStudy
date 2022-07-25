// 시험 성적
import java.io.*;

public class BJ9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int score = Integer.parseInt(br.readLine());
        String result = "F";

        if (score >= 90) result = "A";
        else if (score >= 80) result = "B";
        else if (score >= 70) result = "C";
        else if (score >= 60) result = "D";

        bw.write(result);
        br.close();
        bw.close();
    }
}
