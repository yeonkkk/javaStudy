package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Three_Dices_2480 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tokens = bf.readLine(); bf.close();
        StringTokenizer st = new StringTokenizer(tokens);

        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());

        int prize = 0;

        //RULE1
        if( dice1 == dice2 && dice2 == dice3) {
            prize = 10000 + dice1*1000;
        }
        //RULE2
        else if( dice1 == dice2 || dice2 == dice3 || dice1 == dice3){
            int sameDice = 0;
            if(dice1 == dice2) {
                sameDice = dice1;
            } else if(dice2 == dice3) {
                sameDice = dice2;
            } else if(dice1 == dice3){
                sameDice = dice3;
            }
            prize = 1000 + sameDice*100;
        }
        //RULE3
        else if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3){
            int bigDice = 0;
            int[] arr = {dice1, dice2, dice3};
            //max값 확인
            for (int i=0; i<3; i++){
                if(arr[i]>=bigDice){
                    bigDice = arr[i];
                }
            }
            prize = bigDice * 100;
        }
        System.out.println(prize);
    }
}
