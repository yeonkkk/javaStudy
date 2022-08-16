import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2530 {
  public static void main(String[] args) throws IOException {
    // I/O Set-up
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    // var-init
    int hour = Integer.parseInt(st.nextToken());
    int min = Integer.parseInt(st.nextToken());
    int sec = Integer.parseInt(st.nextToken());

    int cookSec = Integer.parseInt(br.readLine());

    int cookHour = 0;
    int cookMin = 0;

    if(cookSec >= 3600){
      cookHour = cookSec / 3600;
      cookSec = cookSec % 3600;
    }
    if(cookSec >= 60){
      cookMin = cookSec / 60;
      cookSec = cookSec % 60;
    }
    hour += cookHour;
    min += cookMin;
    sec += cookSec;

    // Calculate
    if(sec >= 60){    // 60초 이상일 때
      min += sec / 60;
      sec %= 60;
    }
    if(min >= 60){    // 60분 이상일 때
      hour += min / 60;
      min %= 60;
    }
    if(hour >= 24){   // 24시간 이상일 때
      hour %= 24;
    }

    // Out-put
    bw.write(hour+" "+min+" "+sec);
    bw.close();
    br.close();
  }
}
