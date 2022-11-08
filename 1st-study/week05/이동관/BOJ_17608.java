import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_17608 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> height = new ArrayList<>();

    String temp;
    while((temp = br.readLine()) != null && !temp.isEmpty()){
      height.add(Integer.parseInt(temp));
    }

  // Calculate
    int count = 1;

    int right = height.get(height.size() - 1);

    for (int i = height.size() - 2; i >= 0; i--) {
      if (height.get(i) > right) {
        right = height.get(i);
        count++;
      }
    }

  // Out-put
    bw.write(String.valueOf(count));
    bw.close();
    br.close();
  }
}
