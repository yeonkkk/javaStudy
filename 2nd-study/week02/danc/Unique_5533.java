package season2;

import java.io.*;
import java.util.*;

public class Unique_5533 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;
        int players = Integer.parseInt(br.readLine());
        int[][] arr = new int[players][3];

        for(int i=0; i<players; i++){
            tk = new StringTokenizer(br.readLine());
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        games(arr, players);
        //bw.write(games(arr, players));
    }

    private static void games(int[][] arr, int players) {

        int[] playerScores = new int[players];
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        for(int q = 0; q<3; q++)    {

            for(int i=0; i<players; i++) {
                for(int j=0; j<players; j++) {
                    if(i == j) continue;
                    if(arr[i][q] != arr[j][q]) { sum = arr[i][q]; }
                    else {
                        sum = 0; break;
                    }
                }
                playerScores[i] += sum;
                sum = 0;
            }
        }
        Arrays.stream(playerScores).forEach(System.out::println);
    }
}
