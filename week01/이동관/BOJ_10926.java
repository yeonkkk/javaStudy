import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10926 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    // StringBuilder set-up
    StringBuilder sb = new StringBuilder();

    // Calculate
    sb.append(br.readLine());
    sb.append("??!");

    // Out-put
    bw.write(sb.toString());
    bw.close();
  }
}
