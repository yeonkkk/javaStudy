package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _10156_과자 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //배열로 변환
        Integer[] result = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        //(과자가격 * 과자개수) - 가진돈
        int get = (result[0]*result[1]) - result[2];
        //돈이 남을 경우, 받아야 될 돈을 0 으로 초기화
        if(get < 0) get = 0;
        bw.write(String.valueOf(get));
        bw.close();
    }
}
