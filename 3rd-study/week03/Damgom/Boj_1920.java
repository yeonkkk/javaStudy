import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1920 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1920 수 찾기
        이분탐색
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            if((binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0)) {
                sb.append(1).append("\n");
            }else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(num < arr[mid]) {
                high = mid - 1;
            }else if(num > arr[mid]) {
                low = mid + 1;
            }else return mid;
        }
        return -1;
    }
}