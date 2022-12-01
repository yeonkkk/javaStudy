import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ10866_Deque {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i< N; i++){
            String temp = br.readLine();
            if(temp.contains("push_")){
                tk = new StringTokenizer(temp);
                String head = tk.nextToken();
                Integer num = Integer.parseInt(tk.nextToken());
                dequeFunc(head,num,deque);
            } else {
                bw.write(dequeFunc(temp, null, deque).toString()+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }

    static StringBuilder dequeFunc(String command, Integer num, Deque<Integer> deque) {
        StringBuilder sb = new StringBuilder();

        switch(command){
            case "push_front":
                deque.addFirst(num);
                break;
            case "push_back":
                deque.addLast(num);
                break;
            case "pop_front":
                if(deque.isEmpty()){
                    sb.append("-1");
                } else {
                    sb.append(deque.peekFirst());
                    deque.pollFirst();
                }
                break;
            case "pop_back":
                if(deque.isEmpty()){
                    sb.append("-1");
                } else {
                    sb.append(deque.peekLast());
                    deque.pollLast();
                }
                break;
            case "size":
                sb.append(deque.size());
                break;
            case "empty":
                sb.append(deque.isEmpty() ? "1" : "0");
                break;
            case "front":
                if(deque.isEmpty()){
                    sb.append("-1");
                } else {
                    sb.append(deque.peekFirst());
                }
                break;
            case "back":
                if(deque.isEmpty()){
                    sb.append("-1");
                } else {
                    sb.append(deque.peekLast());
                }
                break;
        }
        return sb;
    }
}
