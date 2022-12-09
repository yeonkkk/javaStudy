import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1260 {
    static int node;
    static int edges;
    static int start;
    static int[][] graph;
    static Queue<Integer> queue = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        /*
        boj_1260 dfs와 bfs
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edges = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        graph = new int[node+1][node+1];
        visit = new boolean[node+1];
        for(int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(start);
        sb.append("\n");
        visit = new boolean[node+1];
        bfs(start);
        System.out.println(sb);
    }
    public static void dfs(int start) {
        visit[start] = true;
        sb.append(start).append(" ");
        for(int i = 1; i <= node; i++) {
            if (graph[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
    public static void bfs(int start) {
        queue.add(start);
        visit[start] = true;
        while(!queue.isEmpty()) {
            start = queue.poll();
            sb.append(start).append(" ");
            for(int i = 1; i <= node; i++) {
                if(graph[start][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}