import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2562 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    List<Integer> list = new ArrayList<>();
    String temp;
    while((temp = br.readLine()) != null && !temp.isEmpty()){
      list.add(Integer.parseInt(temp));
    }

  // Calculate
    int max = list.stream().max(Integer::compare).orElse(-1);
    int maxIdx = list.indexOf(max) + 1;

  // Out-put
    bw.write(String.valueOf(max));
    bw.newLine();
    bw.write(String.valueOf(maxIdx));
    bw.close();
    br.close();
  }
}
