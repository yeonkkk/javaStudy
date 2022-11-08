import java.io.*;


public class BOJ_10179 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    // var-init
    double discount = 0.8;
    int testCase = Integer.parseInt(br.readLine());

    double[] testCaseArr = new double[testCase];

    // Calculate
    for (double d : testCaseArr){
      d = Double.valueOf(br.readLine()) * discount;
      bw.write(String.format("$%.2f",d));
      bw.newLine();
    }

    // Out-put
    bw.close();
    br.close();
  }
}
