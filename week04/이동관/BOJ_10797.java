import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class BOJ_10797 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    String comp = br.readLine();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = 0;

  // Calculate
    while(st.hasMoreTokens()){
      if(comp.equals(st.nextToken())) count++;
    }

  // Out-put
    bw.write(String.valueOf(count));
    bw.flush();
    bw.close();
    br.close();
  }
}
