import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10828_Stack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer bf = new StringBuffer();
        StringTokenizer tk;

        int cases = Integer.parseInt(br.readLine());
        ArrayList<Integer> doStack = new ArrayList<>();
        Integer tempInt = 0;

        for (int i = 1; i <= cases; i++) {
            //if (countForPush == cases) break;
            String temp = br.readLine();

            if (temp.contains("push")) {
                tk = new StringTokenizer(temp);
                String command = tk.nextToken();
                Integer num = Integer.parseInt(tk.nextToken());
                myStack(command, num, doStack);
            } else {
                tempInt = myStack(temp, null, doStack);
                //bw.write(String.valueOf(tempInt));
                bw.write(Integer.toString(tempInt));
                bw.write("\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static Integer myStack(String command, Integer num, ArrayList<Integer> doStack) {

        Integer ans = 0;

        switch (command) {
            case "push":
                doStack.add(num);
                break;

            case "pop":
                if (doStack.isEmpty()) ans = -1;
                else {
                    ans = doStack.get(doStack.size() - 1);
                    doStack.remove(doStack.size() - 1);
                }
                break;

            case "size":
                ans = doStack.size();
                break;

            case "empty":
                ans = (doStack.isEmpty() == true) ? 1 : 0;
                break;

            case "top":
                if (doStack.isEmpty()) ans = -1;
                else {
                    ans = doStack.get(doStack.size() - 1);
                }
                break;
        }
        return ans;
    }
}
