import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BOJ 1260. DFS와 BFS
 * nullPointException 발생
 */
public class Boj1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        Map<Integer, List<Integer>> graph = makeGraph(m, br);

        dfs(graph, v, n);
        System.out.println();
        bfs(graph, v, n);
    }

    public static Map<Integer, List<Integer>> makeGraph(int m, BufferedReader br) throws IOException {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            builder(node1, node2, graph);
            builder(node2, node1, graph);
        }
        return graph;
    }

    public static void builder(int node1, int node2, Map<Integer, List<Integer>> graph) {
        if (!graph.containsKey(node1)) {
            graph.put(node1, new ArrayList<>());
        }
        List<Integer> value = graph.get(node1);
        value.add(node2);

        graph.put(node1, value);
    }

    public static void dfs(Map<Integer, List<Integer>> graph, int v, int n) {
        boolean[] check = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(v);

        while (!stack.isEmpty()) {
            int cur = stack.pop();

            if (check[cur]) {
                continue;
            }

            System.out.printf("%d ", cur);
            check[cur] = true;
            graph.get(cur).sort(Collections.reverseOrder());
            stack.addAll(graph.get(cur));
        }
    }

    public static void bfs(Map<Integer, List<Integer>> graph, int v, int n) {
        boolean[] check = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (check[cur]) {
                continue;
            }

            System.out.printf("%d ", cur);
            check[cur] = true;

            graph.get(cur).sort(Integer::compareTo);
            queue.addAll(graph.get(cur));
        }
    }
}

