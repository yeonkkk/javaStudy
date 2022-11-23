package season2;

import java.io.*;

public class Laundromat_Owner_DongHyuk_2720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cases = Integer.parseInt(br.readLine());
        for(int i=0; i<cases; i++) {
            int money = Integer.parseInt(br.readLine());
            bw.write(exchange(money));
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static String exchange(int money) {

        StringBuffer sb = new StringBuffer();
        int[] coins = new int[4];
        coins[0] = money/25;
        money -= coins[0]*25;
        coins[1] = money/10;
        money -= coins[1]*10;
        coins[2] = money/5;
        money -= coins[2]*5;
        coins[3] = money;

        for(int i=0; i<coins.length; i++){
            //blank is not needed at the end of the String
            if(i == 3) {
                sb.append(coins[i]); break;
            }
            sb.append(coins[i]);
            sb.append(" ");
        }

        return sb.toString();
    }
}
