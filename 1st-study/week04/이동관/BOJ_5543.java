import java.io.*;
import java.util.StringTokenizer;

public class BOJ_5543 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    int menu1 = Integer.parseInt(br.readLine());
    int menu2 = Integer.parseInt(br.readLine());
    int menu3 = Integer.parseInt(br.readLine());

    int drink1 = Integer.parseInt(br.readLine());
    int drink2 = Integer.parseInt(br.readLine());

    br.close();

  // Calculate
    int menu = Math.min(menu1, Math.min(menu2, menu3));
    int drink = Math.min(drink1, drink2);

    String result = String.valueOf(menu + drink - 50);

  // Out-put
    bw.write(result);
    bw.close();
  }
}
