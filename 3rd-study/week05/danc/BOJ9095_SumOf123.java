import java.io.*;

public class BOJ9095_SumOf123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCases = Integer.parseInt(br.readLine());

        for(int i=0; i<testCases; i++){
            bw.append(Integer.toString(
                    dp(Integer.parseInt(br.readLine()))));
            bw.append("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
    //i = i-3 + i-2 + i-1
    private static int dp(int input){
        int[] dp = new int[input];

        if(input == 1) return 1;
        else if(input == 2) return 2;
        else if(input == 3) return 4;

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for(int i=3; i<dp.length; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        return dp[input-1];
    }
}
