import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1085 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

  // Var-init
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());

  // Calculate
    int minWidth = Math.min(x, w - x);
    int minHeight = Math.min(y, h - y);
    int result = Math.min(minWidth, minHeight);

  // Out-put
    bw.write(String.valueOf(result));
    bw.close();
    br.close();
  }
}
