import java.io.*;
import java.util.StringTokenizer;

public class BOJ_6609 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

  // Var-init
    long M;
    long P;
    long L;
    long E;
    long R;
    long S;
    long N;

  // Calculate
    String temp;
    while((temp = br.readLine()) != null && !temp.isEmpty()){
      st = new StringTokenizer(temp);
      M = Long.parseLong(st.nextToken());
      P = Long.parseLong(st.nextToken());
      L = Long.parseLong(st.nextToken());
      E = Long.parseLong(st.nextToken());
      R = Long.parseLong(st.nextToken());
      S = Long.parseLong(st.nextToken());
      N = Long.parseLong(st.nextToken());
    }

  // Out-put


    bw.close();
    br.close();
  }
}
