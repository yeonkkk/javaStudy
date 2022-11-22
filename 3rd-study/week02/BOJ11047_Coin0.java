import java.io.*;
import java.util.StringTokenizer;
//그리디
public class BOJ11047_Coin0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;
        tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int K = Integer.parseInt(tk.nextToken());
        int[] coins = new int[N];
        for(int i=0; i<N;i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        bw.write(coin(K, coins));
        bw.flush();
        br.close();
        bw.close();
    }

    static String coin(int K, int[] coins){

        int numOfCoinsRequired = 0;
        for(int i = coins.length-1; i>=0; i--){
            if(coins[i]<=K){
                numOfCoinsRequired += K / coins[i];
                K = K % coins[i];
            }
        }
        return Integer.toString(numOfCoinsRequired);
    }
}
