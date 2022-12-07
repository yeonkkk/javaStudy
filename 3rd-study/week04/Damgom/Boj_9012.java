import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_9012 {
    /*
    boj_9012 괄호, 스택
     */
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String parenthesis = br.readLine();
            checkParenthesis(parenthesis);
        }
        System.out.println(sb);
    }

    public static void checkParenthesis(String parenthesis) {
        int count = 0;
        for(int i = 0; i < parenthesis.length(); i++) {
            if(parenthesis.charAt(i) == '(') {
                count++;
            }else count--;
            if(count < 0) {
                break;
            }
        }
        if(count == 0) {
            sb.append("YES").append("\n");
        }else sb.append("NO").append("\n");
    }
    //    public static void checkParenthesis(String parenthesis) {
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0; i < parenthesis.length(); i++) {
//            char temp = parenthesis.charAt(i);
//            if(temp == '(') {
//                stack.push(temp);
//            }else if(temp == ')' && !stack.isEmpty()) {
//                stack.pop();
//            }else {
//                stack.push('.');
//                break;
//            }
//        }
//        if(!stack.isEmpty()) {
//            sb.append("NO").append("\n");
//        }else sb.append("YES").append("\n");
//    }
}