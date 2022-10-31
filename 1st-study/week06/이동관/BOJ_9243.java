import java.io.*;

public class BOJ_9243 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    int loop = Integer.parseInt(br.readLine());
    String input = br.readLine();
    String output = br.readLine();

  // Calculate
    while(loop > 0){
      input = input.replaceAll("0", "-");
      input = input.replaceAll("1", "0");
      input = input.replaceAll("-", "1");
      loop--;
    }

  // Out-put
    if(output.equals(input)){
      bw.write("Deletion succeeded");
    } else {
      bw.write("Deletion failed");
    }
    bw.close();
    br.close();
  }
}