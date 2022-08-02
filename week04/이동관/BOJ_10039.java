import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10039 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    int len = 5;
    int total = 0;

  // Calculate
    while(len > 0){
      int current = Integer.parseInt(br.readLine());
      if( current < 40 ) current = 40;
      total += current;
      len--;
    }
    String result = String.valueOf(total / 5);

  // Out-put
    bw.write(result);
    bw.close();
    br.close();
  }
}
