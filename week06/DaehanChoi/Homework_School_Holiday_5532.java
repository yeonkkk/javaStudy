package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Homework_School_Holiday_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalDays = Integer.parseInt(bf.readLine());
        int math = Integer.parseInt(bf.readLine());
        int korean = Integer.parseInt(bf.readLine());
        int math_MAX_PAGE = Integer.parseInt(bf.readLine());
        int korean_MAX_PAGE = Integer.parseInt(bf.readLine());
        bf.close();

        //days가 큰걸 다시 기준으로 정해야한다.
        //수학 days구한것을 korean days랑 비교해서 큰수를 찾아야한다.

        int days = 0;

        if(math%math_MAX_PAGE != 0) {
             days = math/math_MAX_PAGE+1;
        } else {
             days = math/math_MAX_PAGE;
        }

        if(korean % korean_MAX_PAGE != 0) {
            if(days < korean/korean_MAX_PAGE+1) {
                days = korean/korean_MAX_PAGE+1;
            }
        } else {
            if(days < korean/korean_MAX_PAGE) {
                days = korean/korean_MAX_PAGE;
            }
        }
        System.out.println(totalDays-days);
    }
}
