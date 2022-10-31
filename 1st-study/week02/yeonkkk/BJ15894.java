import java.io.*;

public class BJ15894 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        String result = String.valueOf(n * 4);

        bw.write(result);
        br.close();
        bw.close();
    }
}
