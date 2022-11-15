import java.util.*;

public class BOJ11866_Josephus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer tk;
        tk = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(tk.nextToken());
        int K = Integer.parseInt(tk.nextToken());
        Queue<Integer> ans = Josephus(N,K);


        System.out.print("<");
        while(true){
            System.out.printf("%d", ans.poll());
            if(ans.isEmpty()){
                System.out.print(">");
                break;
            } else {
                System.out.print(", ");
            }
        }
    }

    static Queue<Integer> Josephus(int N, int K){

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            q.add(i);
        }
        int idxCount = 0;

        while(!q.isEmpty()){
            if(idxCount < K-1) {
                q.add(q.poll()); // send it back if it's not on K
                idxCount++;
            } else { //idxcount == K
                ans.add(q.poll());
                idxCount = 0;
            }
        }
        return ans;
    }
    /* 3 6 2 7 5 1 4
    1 2 3 4 5 6 7
    1 2 0 4 5 0 7
    1 4 5
    1 4
     */

}
