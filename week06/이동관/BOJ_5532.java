import java.io.*;
import java.util.StringTokenizer;

public class BOJ_5532 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    int L = Integer.parseInt(br.readLine());
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int D = Integer.parseInt(br.readLine());

    int AdivC = 0;
    int BdivD = 0;

  // Calculate
    if( A % C == 0){
      AdivC = A / C;
    } else {
      AdivC = A / C + 1;
    }

    if(B % D == 0) {
      BdivD = B / D;
    } else {
      BdivD = B / D + 1;
    }

    int workDay = Math.max(AdivC, BdivD);

    int restDay = L - workDay;

  // Out-put
    bw.write(String.valueOf(restDay));
    bw.close();
    br.close();
  }
}
