import java.io.*;
import java.util.StringTokenizer;

public class BOJ_6609 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

  // Var-init
    long M;
    long P;
    long L;
    long E;
    long R;
    long S;
    long N;

  // Loop-Control
    String temp;
    while((temp = br.readLine()) != null && !temp.isEmpty()){
      st = new StringTokenizer(temp);
      M = Long.parseLong(st.nextToken());   //  성충 초기값
      P = Long.parseLong(st.nextToken());   //  번데기 초기값
      L = Long.parseLong(st.nextToken());   //  유충 초기값
      E = Long.parseLong(st.nextToken());   //  성충 모기가 알을 낳는 개수
      R = Long.parseLong(st.nextToken());   //  R번째 유충 -> 번데기
      S = Long.parseLong(st.nextToken());   //  S번째 번데기 -> 성충
      N = Long.parseLong(st.nextToken());   //  기간
      bw.write(calculate(M,P,L,E,R,S,N));
      bw.newLine();
    }

  // Out-put
    bw.close();
    br.close();
  }
  // Calculate
  public static String calculate(long M, long P, long L, long E, long R, long S, long N){

    while(N > 0){
      long tempM = P / S;
      long tempP = L / R;
      long tempL = M * E;
      P = tempP;
      L = tempL;
      M = tempM;
      N--;
    }

    return String.valueOf(M);
  }
}
