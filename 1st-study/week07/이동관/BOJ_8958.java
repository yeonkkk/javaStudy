import java.io.*;

public class BOJ_8958 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // Var-init
    int caseNum = Integer.parseInt(br.readLine());
    int score = 0;
    int sum = 0;

  // Calculate
    while(caseNum > 0){
      String input = br.readLine();

      for (int i = 0; i < input.length(); i++) {
        if(input.charAt(i) == 'O'){
          score++;
          sum += score;
        } else {
          score = 0;
        }
      }

      bw.write(String.valueOf(sum));
      score = 0;
      sum = 0;
      caseNum--;
      if(caseNum != 0) bw.newLine();
    }

  // Out-put
    bw.close();
    br.close();
  }
}
