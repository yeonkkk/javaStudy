import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 1;
        while(!queue.isEmpty()) {
            if(count != k) {
                queue.offer(queue.poll());
                count++;
            }else {
                result.add(queue.poll());
                count = 1;
            }
        }
        for(int i = 0; i < result.size(); i++) {
            if(i == result.size()-1) {
                sb.append(result.get(i));
            }else sb.append(result.get(i)).append(",").append(" ");
        }
        System.out.println("<" + sb + ">");
    }
}