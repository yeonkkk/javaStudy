import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj_1874 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1874 스택 수열, stack
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        int temp = 1;
        boolean result = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            for(; temp <= target; temp++) {
                deque.offerLast(temp);
                sb.append('+').append('\n');
            }
            if(deque.peekLast() == target) {
                deque.pollLast();
                sb.append('-').append('\n');
            }else result = false;
        }

        if(result) {
            System.out.println(sb);
        }else System.out.println("NO");
    }
}