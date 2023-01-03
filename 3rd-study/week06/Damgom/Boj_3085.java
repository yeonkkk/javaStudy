import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_3085 {
    /*
    boj_3085 사탕 게임
     */
    static int candy;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Character[][] arr = new Character[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                char temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;
                checkCandy(arr);
                arr[i][j+1] = arr[i][j];
                arr[i][j] = temp;
            }
            answer = Math.max(candy, answer);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                char temp = arr[j][i];
                arr[j][i] = arr[j+1][i];
                arr[j+1][i] = temp;
                checkCandy(arr);
                arr[j+1][i] = arr[j][i];
                arr[j][i] = temp;
            }
            answer = Math.max(candy, answer);
        }
        System.out.println(answer);
    }
    public static void checkCandy(Character[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i][j] == arr[i][j+1]) {
                    count++;
                }else {
                    count = 1;
                }
                candy = Math.max(candy, count);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j][i] == arr[j+1][i]) {
                    count++;
                }else {
                    count = 1;
                }
                candy = Math.max(candy, count);
            }
        }
    }
}