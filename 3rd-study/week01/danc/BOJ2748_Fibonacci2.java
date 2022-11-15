import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ2748_Fibonacci2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(fibo(n));

    }

    static long fibo(int n) {
        List<Long> ans = new ArrayList<>();
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 1;
        else {
            ans.add((long)0); ans.add((long)1); ans.add((long)1);

            for (int i = 3; i <= n; i++) {
                ans.add(ans.get(i - 1) + ans.get(i - 2));
            }
        }

        return ans.get(n);
    }
}
