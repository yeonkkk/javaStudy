package season2;

import java.util.Scanner;

public class Wanna_be_an_apt_president_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int k = sc.nextInt(); // floor
            int n = sc.nextInt(); // unit
            int fill = 1;
            int[][] arr = new int[k + 1][n];

            /*for(int q=0; q<arr.length;q++){
                System.out.println(Arrays.toString(arr[q]));
            }*/

            // init floor 0
            // only need to be iterated by given unit n
            for (int j = 0; j < n; j++) {
                arr[0][j] = fill++;
            }

            //init floor by floor
            for (int j = 1; j <= k; j++) {
                int sum = 0;
                for (int f = 0; f < n; f++) {
                    arr[j][f] = sum + arr[j - 1][f];
                    sum += arr[j - 1][f];
                }
            }

            System.out.println(arr[k][n - 1]);
        }
    }
}
