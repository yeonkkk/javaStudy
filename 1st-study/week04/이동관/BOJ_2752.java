import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2752 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

  // var-init
    int[] al = new int[3];

  // Calculate
    int idx = 0;
    while(st.hasMoreTokens())
    {
      al[idx] = Integer.parseInt(st.nextToken());
      idx++;
    }
    Arrays.sort(al);
    for(int i : al){
      sb.append(i);
      sb.append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);

  // Out-put
    bw.write(sb.toString());
    bw.close();
    br.close();
  }
}
