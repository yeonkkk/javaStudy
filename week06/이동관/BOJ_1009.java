import java.io.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1009 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));


    // Var-init
    int testCase = Integer.parseInt(br.readLine());
    Queue<String> que = new LinkedList<>();

  // Calculate
    while(testCase > 0){
      String data = br.readLine();
      que.add(data);
      testCase--;
    }

    while (!que.isEmpty()) {
      StringTokenizer st = new StringTokenizer(que.poll());
      long a = Long.parseLong(st.nextToken());
      long b = Long.parseLong(st.nextToken());
      long powRemainder = 1;
      while (b > 0) {
        powRemainder = (powRemainder * a) % 10;
        b--;
        if (b == 0) {
          if(powRemainder == 0){
            bw.write("10");
          } else {
            bw.write(String.valueOf(powRemainder));
          }
          bw.newLine();
        }
      }
    }

  // Out-put
    bw.close();
    br.close();
  }
}
