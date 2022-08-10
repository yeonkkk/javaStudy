import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_12873 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    int N = Integer.parseInt(br.readLine());
    int round = 1;
    int count = 0;

    Queue<Integer> que = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      que.add(i);
    }

  // Calculate
    while (que.size() != 1) {
      count++;
      if (count != Math.pow(round, 3)) {
        que.add(que.poll());
      } else {
        que.poll();
        round++;
        count = 0;
      }
    }

  // Out-put
    bw.write(String.valueOf(que.poll()));
    bw.close();
    br.close();
  }
}