import java.io.*;

public class BOJ_2588 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    // var-init
    int num1 = Integer.parseInt(br.readLine());
    int num2 = Integer.parseInt(br.readLine());

    // Calculate
    int num3 = num1 * (num2 % 10);
    int num4 = num1 * ((num2 % 100) / 10);
    int num5 = num1 * (num2 / 100);
    int num6 = num1 * num2;

    // Out-put
    bw.write(String.valueOf(num3));
    bw.newLine();
    bw.write(String.valueOf(num4));
    bw.newLine();
    bw.write(String.valueOf(num5));
    bw.newLine();
    bw.write(String.valueOf(num6));
    bw.newLine();
    bw.close();
    br.close();
  }
}
