import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

//인접 행렬 dfs
public class BOJ2606_Virus {
    static boolean[] Visited;
    static int count;

    public static void main(String[] args) throws IOException {

        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;


        int numOfPC = Integer.parseInt(br.readLine());
        int pairs = Integer.parseInt(br.readLine());
        Visited = new boolean[numOfPC+1];
        int[][] nodes = new int[numOfPC+1][numOfPC+1];
        int from;
        int to;

        // connect PCs
        for(int i=0; i<pairs;i++){
            tk = new StringTokenizer(br.readLine());
            from = Integer.parseInt(tk.nextToken());
            to = Integer.parseInt(tk.nextToken());

            nodes[from][to] = nodes[to][from] = 1; //연결된 것들은 1로 나머지는 0으로
        }
        dfsRecursion(1, nodes);
        System.out.println(count);
        //dfsStack(1, nodes);
        //System.out.println(count);

        // for recursion System.out.println(count-1);

         for(int i=0; i<numOfPC;i++){
            for (int j=0; j<numOfPC;j++) {
                System.out.printf("%d ", nodes[i][j]);
            }
            System.out.println();
        }
    }
 /*   // 스택은 실패 - 재귀 쓰는게 그냥 맘 편할듯??
    static void dfsStack(int idx, int[][] nodes){

        Stack<Integer> stack = new Stack<>();
        stack.add(idx);

        while(!stack.isEmpty()){

            int current = stack.pop();

            if(Visited[current]) continue;
            Visited[current] = true;

            for(int i=0; i< Visited.length;i++){

                if(!Visited[i] && nodes[current][i]==1){
                    Visited[current] = true;
                    stack.add(i);
                    ++count;
                }
            }
        }
    }*/

    static void dfsRecursion(int idx, int[][] nodes){

        if(Visited[idx]) return;
        Visited[idx] = true;

        for(int next=0; next<Visited.length; next++){
            if(!Visited[next] && nodes[idx][next]==1){
                dfsRecursion(next,nodes);
                ++count;
            }
        }
        /* 좌표처럼 생각
        *   0 0 0 0 0 0 0
            0 0 1 0 0 1 0
            0 1 0 1 0 1 0
            0 0 1 0 0 0 0
            0 0 0 0 0 0 0
            0 1 1 0 0 0 1
            0 0 0 0 0 1 0 */

    }
}
