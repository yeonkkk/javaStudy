import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_7568 {
    public static void main(String[] args) throws IOException {
        /*
        7568 덩치
        완전탐색
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            arr[i][0] = weight;
            arr[i][1] = height;
        }
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            int count = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    count++;
                }
                result[i] = count;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n-1; i++) {
            sb.append(result[i]).append(" ");
        }
        sb.append(result[result.length-1]);
        System.out.println(sb);
    }
}