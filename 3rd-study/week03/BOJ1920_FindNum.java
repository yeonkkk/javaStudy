import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920_FindNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        int[] A = new int[N];
        String input = br.readLine();
        tk = new StringTokenizer(input);
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        String temp = br.readLine();
        tk = new StringTokenizer(temp);

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(tk.nextToken());
            if (binarySearch(A, target) >= 0) {
                bw.write(1 + "\n");
            } else {
                bw.write(0 + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int binarySearch(int[] A, int target) {
        int first = 0;
        int last = A.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;

            //target is smaller than mid -> change last index
            if (target < A[mid]) {
                last = mid - 1;
            }
            //target is bigger than mid -> change first index
            else if (target > A[mid]) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        //target has not found
        return -1;
    }
}
