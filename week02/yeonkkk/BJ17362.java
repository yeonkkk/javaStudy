import java.io.*;

public class BJ17362 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine()) - 5;
        long m = n / 4;
        long r = n % 4;
        long result;

        if (n <= 0) result = n + 5;
        else if (m % 2 == 0) {
            if (r == 0) result = 5L;
            else result = 5 - r;
        } else {
            if (r == 0) result = 1L;
            else result = r + 1;
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}
