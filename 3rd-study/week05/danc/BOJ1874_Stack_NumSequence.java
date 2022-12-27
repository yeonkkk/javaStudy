import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class BOJ1874_Stack_NumSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer bf = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n+1]; //0번째 인덱스 사용 안함
        Stack<Integer> stack = new Stack<>();
        int target = 1;

        for(int i=1; i<=n; i++){
            seq[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1; i<=n; i++){
            stack.push(i);
            bf.append("+").append("\n");
            try {
                while (stack.peek() == seq[target] && !stack.isEmpty()) {
                    stack.pop();
                    bf.append("-").append("\n");
                    target++;
                }
            }
            catch (EmptyStackException e){

            }
        }

        if(stack.isEmpty()) {
            System.out.print(bf.toString());
        }
        else {
            System.out.println("NO");
        }
        br.close();
    }
}
