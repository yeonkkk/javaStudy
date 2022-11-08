package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Warning_3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String current_time = bf.readLine();
        String time_to_throw = bf.readLine();
        bf.close();

        //: 를 기준으로 쪼개기
        StringTokenizer st1 = new StringTokenizer(current_time, ":");
        StringTokenizer st2 = new StringTokenizer(time_to_throw, ":");

        //initialize arr
        int[] currArr = new int[3];
        int[] throwtimeArr = new int[3];
        for(int i=0; i<3; i++){
            currArr[i] =
                    Integer.parseInt(st1.nextToken());
            throwtimeArr[i] =
                    Integer.parseInt(st2.nextToken());
        }

        //calculation (flow: sec -> min -> hrs)
        int[] answer = calculation(throwtimeArr, currArr);

        //출력 서식을 맞추기 위해 int[] -> String[] 으로 다시 전환
        String[] finalArr = new String[3];

        for(int k=0; k<finalArr.length;k++) {
            //요소가 10의 자리 미만일때 앞에 0을 붙인다
            if(answer[k]/10 < 1) {
                finalArr[k] = "0" + Integer.toString(answer[k]);
            } else {
                finalArr[k] = Integer.toString(answer[k]);
            }
        }

        //반례 케이스 00시에서 00시는 24시간
        if(finalArr[0].equals("00") && finalArr[1].equals("00") && finalArr[2].equals("00")) {
            System.out.printf("24:00:00");
        }
        else { //나머지 정상 케이스
            System.out.printf("%s:%s:%s",finalArr[0],finalArr[1],finalArr[2]);
        }
    }

    //Hr,Min,Sec Calculation
    public static int[] calculation(int[] throwtimeArr, int[] currArr){

        int[] answer = new int[3];

        //seconds
        if(throwtimeArr[2] < currArr[2]) {
            throwtimeArr[1] -= 1;
            answer[2] = throwtimeArr[2] +60 -currArr[2];
        }else answer[2] = throwtimeArr[2] - currArr[2];

        //min
        if(throwtimeArr[1] < currArr[1]) {
            throwtimeArr[0] -= 1;
            //만약 현재 hour가 0일 경우도 추가해야함
            if(throwtimeArr[0] == -1) throwtimeArr[0] = 23;

            answer[1] = throwtimeArr[1]+60-currArr[1];
        } else answer[1] = throwtimeArr[1] - currArr[1];

        //hour
        if(throwtimeArr[0] < currArr[0]) {
            answer[0] = throwtimeArr[0] + 24 - currArr[0];
        } else answer[0] = throwtimeArr[0] - currArr[0];

        return answer;
    }

}
