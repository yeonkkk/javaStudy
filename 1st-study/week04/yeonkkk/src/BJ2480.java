// 주사위 세개
import java.io.*;

public class BJ2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input 받아오기 & 빈도 확인을 위한 count 배열
        String[] nums = br.readLine().split(" ");
        int[] count = new int[7];
        for (String n : nums) count[Integer.parseInt(n)]++;

        // 빈도 값을 비교하여 사용할 눈을 찾는다
        int maxVal = 0;
        int maxKey = 0;

        for (int i = 1; i < count.length; i++) {
            int cur = count[i];
            if(maxVal <= cur) {
                maxKey = i;
                maxVal = cur;
            }

            if (maxVal == 3) break;
        }

        // 결과 출력
        bw.write("" + calculator(maxKey, maxVal));
        br.close();
        bw.close();
    }

    // 빈도 수에 따른 상금 계산
    public static int calculator(int key, int val){
        int result = 0;

        switch (val){
            case 3: result = 10000 + key * 1000; break;
            case 2: result = 1000 + key * 100; break;
            default: result = key * 100;
        }
        return result;
    }
}
