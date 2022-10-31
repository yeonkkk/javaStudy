import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_2754 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    String[] key = new String[]{"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
    double[] value = new double[]{4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};

    HashMap<String, Double> score = new HashMap<>();
    for (int i = 0; i < key.length; i++) {
      score.put(key[i], value[i]);
    }

    String input = br.readLine();

  // Calculate
    String result = String.valueOf(score.get(input));

  // Out-put
    bw.write(result);
    bw.close();
    br.close();
  }
}
