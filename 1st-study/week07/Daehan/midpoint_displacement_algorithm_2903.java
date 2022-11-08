package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class midpoint_displacement_algorithm_2903 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        bf.close();

        // N
        // 1     2     3     4     5        6

        //정사각형 한면 개수
        // 1     2     4     8     16       32
        // 2^2  3^3   5^5   9^9   17*17    33*33

        //전체로 봤을때 한 면의 정사각형 개수는 2배씩 증가함
        // 점의 개수는 정사각형 개수+1 의 제곱수임
        double side = 1;
        for(int i=0; i<N; i++) {
            side*=2;
        }
        System.out.println((int) Math.pow(side+1,2));
    }
}
