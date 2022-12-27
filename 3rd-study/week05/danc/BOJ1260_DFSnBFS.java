import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260_DFSnBFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        int vertex = Integer.parseInt(tk.nextToken());
        int edge = Integer.parseInt(tk.nextToken());
        int startingVertex = Integer.parseInt(tk.nextToken());

        boolean[] visitedDFS = new boolean[vertex+1];
        boolean[] visitedBFS = new boolean[vertex+1];

        //for order by visiting vertices
        Queue<Integer> visiting = new ArrayDeque<>();

        //creating graph elements
        for(int i=0; i<vertex+1; i++){
            graph.add(new ArrayList<Integer>());
        }

        //Connecting vertices
        for(int i=0; i<edge; i++){
            tk = new StringTokenizer(br.readLine());
            if(tk.hasMoreTokens()) {
                int from = Integer.parseInt(tk.nextToken());
                int to = Integer.parseInt(tk.nextToken());

                graph.get(from).add(to);
                graph.get(to).add(from);
            }
        }

        //Sorting Graph (proceed from vertex with lower value)
        for(int i=0; i<graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        dfs(graph, visitedDFS, startingVertex, visiting);
        visiting.clear();
        System.out.println();

        bfs(graph, visitedBFS, startingVertex, visiting);

    }
    private static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visitedDFS, int startingVertex, Queue<Integer> visiting){

        visitedDFS[startingVertex] = true;
        visiting.offer(startingVertex);

        for(int i=0; i<graph.get(startingVertex).size(); i++){
            int nextVertex = graph.get(startingVertex).get(i);

            if(!visitedDFS[nextVertex]){
                dfs(graph, visitedDFS, nextVertex, visiting);
            }
        }
        System.out.print(visiting.poll() + " ");
    }

    private static void bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visitedBFS, int startingVertex, Queue<Integer> visiting){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(startingVertex);
        visitedBFS[startingVertex] = true;

        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            visiting.offer(currentVertex);

            for(int i=0; i<graph.get(currentVertex).size(); i++){
                int nextVertex = graph.get(currentVertex).get(i);
                if(!visitedBFS[nextVertex]) {
                    visitedBFS[nextVertex] = true;
                    queue.offer(nextVertex);
                }
            }
        }

        while(!visiting.isEmpty()){
            System.out.print(visiting.poll() + " ");
        }
    }
}
