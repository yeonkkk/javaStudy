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
    int dest = 1;
    int count = 0;

    Queue<Integer> que = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      que.add(i);
    }

  // Calculate
    while (que.size() != 1) {
      count++;
      if (count != dest) {
        que.add(que.poll());
      } else {
        que.poll();
        round++;
        //  반복 구간을 줄이기 위해 round^3을 que.size()로 나눠줌
        dest = (int) (Math.pow(round, 3) % que.size());
        //  edge-case
          //  round^3 % que.size() == 0 이면 무한반복
        if (dest == 0) dest = que.size();
        count = 0;
      }
    }

  // Out-put
    bw.write(String.valueOf(que.poll()));
    bw.close();
    br.close();
  }
}
