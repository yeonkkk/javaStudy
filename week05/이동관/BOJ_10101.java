import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10101 {
  public static void main(String[] args) throws IOException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

  // var-init
    int ang1 = Integer.parseInt(br.readLine());
    int ang2 = Integer.parseInt(br.readLine());
    int ang3 = Integer.parseInt(br.readLine());

  // Calculate
    if(ang1 + ang2 + ang3 == 180){
      if(ang1 == 60 && ang2 == 60){
        bw.write("Equilateral");
      } else if (ang1 == ang2 || ang2 == ang3 || ang1 == ang3) {
        bw.write("Isosceles");
      } else {
        bw.write("Scalene");
      }
    } else {
      bw.write("Error");
    }
  // Out-put
    bw.close();
    br.close();
  }
}
