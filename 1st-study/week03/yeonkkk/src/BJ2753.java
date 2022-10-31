// 윤년

import java.io.*;

public class BJ2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String result = "0";

        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) result = "1";
        bw.write(result);
        br.close();
        bw.close();
    }
}
