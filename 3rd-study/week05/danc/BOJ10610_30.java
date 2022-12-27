import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/*
* 너무 어려워서 찾아봤습니다 ㅎㅎ
*
* 30의 배수의 조건을 찾아야함
* (조건1) 자리수를 더한것이 3의 배수
* (조건2) 10의 배수여야 한다. --> < 1의자리가 0으로 끝나야 한다 > (가장 작아야하니 내림차순 정렬을 먼저 해봄)
*
* */


public class BOJ10610_30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer bf = new StringBuffer();
        char[] arr = br.readLine().toCharArray();

        //3의배수 확인하기 위한 변수 (모든 자리수의 합이 3의 배수여야함)
        int sum = 0;

        //(조건2) 1의자리가 0으로 끝나야 한다.
        //가장 작아야하니 내림차순 정렬을 먼저 해봄 (오름차순으로 하고, for문에서 내림차순으로 문자열조립)
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; --i){
            sum += ( arr[i]-'0' );  //char를 int로 형변환
            bf.append(arr[i]);      //StringBuffer로 문자열 합체
        }

        //3의 배수가 아니거나, 숫자가 0으로 시작하지 않으면 -1 출력
        if(sum%3!=0 || arr[0]!='0'){
            System.out.println("-1");
        } else {
            System.out.println(bf.toString());
        }
    }
}
