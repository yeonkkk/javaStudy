package backJoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 실버4
// DP
public class 설탕배달 {
    static int[] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>(List.of(3,5));

        int targetG = Integer.parseInt(br.readLine());

        dp = new int[5001];
        dp[3] = 1;
        dp[5] = 1;

        for(int i=6; i<=targetG; i++){
            for(int tmp : list){
                // 해당 g을 만드는데 3 or 5 를 제외한 g을 만드는 방법이 0 일시 넘어감
                // ex) 6g ->   dp[6-5] = dp[1] == 0 ->   해당 케이스는 넘어감
                if(dp[i-tmp] == 0 ) continue;

                // 해당 g을 만드는데 케이스가 아직 없다면, i-tmp 의 봉지개수 + 1
                if(dp[i] == 0) dp[i] = dp[i-tmp]+1;
                // 그 외에는 현재 케이스와 이전케이스를 비교하여 적은 가짓수 선택
                else dp[i] = Math.min(dp[i],dp[i-tmp]+1);
            }
        }

        int flag = dp[targetG];
        if(flag == 0) System.out.println(-1);
        else System.out.println(flag);
    }
}
