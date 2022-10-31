import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class BOJ_3029 {
  public static void main(String[] args) throws IOException, ParseException {
  // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
  // var-init
    Date d1 = sdf.parse(br.readLine());
    Date d2 = sdf.parse(br.readLine());

    // Calculate
    long diff = d2.getTime() - d1.getTime();

    long time = diff / 1000;

    if(time <= 0 ){
      time += 24 * 60 * 60;
    }

    long hour = (time / 60) / 60;
    long min = (time / 60) % 60;
    long sec = time % 60;

  // Out-put
    bw.write(String.format("%02d:%02d:%02d",hour,min,sec));
    bw.close();
    br.close();
  }
}