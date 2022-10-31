import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2161 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

  // var-init
    int N = Integer.parseInt(br.readLine());
    Queue<Integer> que = new LinkedList<Integer>();

    for(int i = 1; i <= N; i++){
      que.add(i);
    }

  // Calculate
    while (!que.isEmpty()) {
      int thrown = que.poll();
      sb.append(thrown + " ");

      if (que.peek() != null) {
        int swab = que.poll();
        que.add(swab);
      }
    }

  // Out-put
    bw.write(sb.toString());
    bw.close();
    br.close();
  }
}