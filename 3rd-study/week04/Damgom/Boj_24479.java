import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_24479 {
    /*
    boj_24479 알고리즘 수업 - 깊이 우선 탐색 1
    dfs
     */
    static int node;
    static int edges;
    static int start;
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] visit;
    static int count;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edges = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        visit = new int[node + 1];
        for (int i = 0; i <= node; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
        count = 1;
        dfs(start);
        for (int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visit[start] = count;
        for (int i = 0; i < graph.get(start).size(); i++) {
            int temp = graph.get(start).get(i);
            if (visit[temp] == 0) {
                count++;
                dfs(temp);
            }
        }
    }
}
    /*
    2중배열을 이용한 dfs 시간초과
     */
//    static int n, m, r;
//    static int[][] graph;
//    static boolean[] visit;
//    static StringBuilder sb;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        r = Integer.parseInt(st.nextToken());
//        graph = new int[n+1][n+1];
//        visit = new boolean[n+1];
//        sb = new StringBuilder();
//        for(int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a][b] = graph[b][a] = 1;
//        }
//
//        dfs(r);
//        for(int i = 1; i <= n; i++) {
//            if(visit[i]) {
//                sb.append(i).append("\n");
//            }else sb.append(0).append("\n");
//        }
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb);
//    }
//    public static void dfs(int start) {
//        visit[start] = true;
//
//        for(int i = 1; i <= n; i++) {
//            if(graph[start][i] == 1 && !visit[i]) {
//                dfs(i);
//            }
//        }
//    }