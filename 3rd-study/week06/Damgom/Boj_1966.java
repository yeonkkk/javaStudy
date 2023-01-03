import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1966 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1966 프린터 큐
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            Queue<Integer> documents = new ArrayDeque<>();
            Queue<Integer> docIndex = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                documents.offer(Integer.parseInt(st.nextToken()));
                docIndex.offer(j);
            }
            int count = 1;
            while (!documents.isEmpty() && !docIndex.isEmpty()) {
                int max = Collections.max(documents);
                if (documents.peek() == max) {
                    if (docIndex.peek() == m) {
                        sb.append(count).append('\n');
                        break;
                    }
                    documents.poll();
                    docIndex.poll();
                    count++;
                }else {
                    documents.offer(documents.poll());
                    docIndex.offer(docIndex.poll());
                }
            }
        }
        System.out.println(sb);
    }
}