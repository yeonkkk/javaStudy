// 분산처리
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a % 10 == 0) {
                bw.write(String.format("10%n"));
                continue;
            }

            int num = a % 10;
            for (int j = 1; j < b; j++)  num = num * a % 10;

            bw.write(String.format("%d%n", num));
        }
        br.close();
        bw.close();
    }
}


/** 실패 코드
public class BJ1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ArrayList resultList = calculator(a, b);

            int idx = b % resultList.size();
            idx = idx == 0 ? idx = resultList.size() - 1 : idx - 1;

            int result = (int) resultList.get(idx);
            bw.write(String.format("%d%n", result == 0 ? 10 : result));
        }

        br.close();
        bw.close();
    }

    public static ArrayList calculator(int a, int b) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        int tmp = a;

        for (int i = 1; i <= b; i++) {
            tmp = tmp * a % 10;
            if (list.contains(tmp)) break;
            else list.add(tmp);
        }
        return list;
    }
}
**/
