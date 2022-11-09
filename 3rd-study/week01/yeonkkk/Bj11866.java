/*
    문제: BOJ 11866. 요세푸스 문제 0
    풀이 방법: Queue
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bj11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNums = br.readLine().split(" ");
        int n = Integer.parseInt(inputNums[0]);
        int k = Integer.parseInt(inputNums[1]);

        Queue<Integer> queue = new LinkedList<>();
        int count = k;
        StringBuilder result = new StringBuilder("<");

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!(queue.size() == 1)) {
            if (count > 1) {
                queue.add(queue.poll());
                count--;
                continue;
            }
            result.append(queue.poll()).append(", ");
            count = k;
        }
        result.append(queue.poll()).append(">");

        System.out.println(result);

        br.close();
    }
}
