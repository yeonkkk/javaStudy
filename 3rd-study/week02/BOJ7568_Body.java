import java.io.*;
import java.util.StringTokenizer;
// 완전 탐색

public class BOJ7568_Body {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cases = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        int[] x = new int[cases];
        int[] y = new int[cases];

        for(int i=0 ; i<cases ; i++){
            tk = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(tk.nextToken());
            y[i] = Integer.parseInt(tk.nextToken());
        }
        /* x == 몸무게
        *  y = 키*/

        /*
        * 전부 1등급인 상태에서 순위에 따라 밀려나는 형식
        * 2중 for문을 돌면서 전부 탐색하면서 비교한다 */

        for(int i=0; i<cases;i++){ // 기준!

            int rank = 1; //1등급으로 시작
            for(int j=0; j<cases; j++){ // 비교!

                if(x[j] > x[i] && y[j] > y[i]){ //몸무게와 키 둘다 비교군과 작을 경우에 rank 밀려남
                    rank++;
                }
                /**/
            }
            System.out.println(rank);
        }
/*
* 240
* 241
* 274
* 235
* 201
* */
    }
}
