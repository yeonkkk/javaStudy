import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
// 큐
public class BOJ10845_Queue1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> list = new LinkedList<>();
        StringTokenizer tk;
        StringBuffer bf = new StringBuffer();
        String input;
        int pushNum;
        int cases = Integer.parseInt(br.readLine());

        for(int i=0; i<cases; i++){
            String inputCheck = br.readLine();

            if(inputCheck.contains("push")){
                tk = new StringTokenizer(inputCheck);
                input = tk.nextToken();
                pushNum = Integer.parseInt(tk.nextToken());
                myQueue(input, pushNum, list);
            } else {
                bf.append(Integer.toString(myQueue(inputCheck, null, list)));
                if(i==cases-1){
                    break;
                } bf.append("\n");
            }
        }
        bw.write(bf.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    static int myQueue(String input, Integer pushNum, Deque<Integer> list){

        int ans = 0;

        switch (input) {
            case "push":
                list.offer(pushNum);
                break;
            case "pop":
                if(list.isEmpty()) ans = -1;
                else {
                    ans = list.poll();
                }
                break;
            case "size":
                ans = list.size();
                break;
            case "empty":
                ans = list.isEmpty() ? 1 : 0;
                break;
            case "front":
                if(list.isEmpty()) ans = -1;
                else ans = list.peek();
                break;
            case "back":
                if(list.isEmpty()) ans = -1;
                else ans = list.peekLast();
                break;
        }
        return ans;
    }
}
