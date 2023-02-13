import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj_2776 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2776 암기왕
         * @binarySearch,hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];
            Set<Integer> set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[i] = temp;
                set.add(temp);
            }
            Arrays.sort(arr);
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                int temp = Integer.parseInt(st.nextToken());
                int existNum = usingSet(set, temp);
                if (i == m - 1) {
                    sb.append(existNum);
                }else sb.append(existNum).append("\n");
//                int existNum = binarySearch(arr, temp);
//                if (i == m - 1) {
//                    sb.append(existNum);
//                }else {
//                    sb.append(existNum).append("\n");
//                }
            }
            System.out.println(sb);
        }
    }
    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean flag = false;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == num) {
                flag = true;
                break;
            }else if (arr[mid] < num) {
                start = mid + 1;
            }else if (arr[mid] > num) {
                end = mid - 1;
            }
        }
        if (flag) {
            return 1;
        }else return 0;
    }
    public static int usingSet(Set<Integer> set, int num) {
        if (set.contains(num)) {
            return 1;
        }else return 0;
    }
}
