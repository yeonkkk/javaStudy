import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1330 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    // var-init
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());
    String result = "";

    // Calculate
    if(num1 == num2){
      result = "==";
    } else if(num1 > num2){
      result = ">";
    } else {
      result = "<";
    }
    // Out-put
    bw.write(result);
    bw.close();
    br.close();
  }
}
