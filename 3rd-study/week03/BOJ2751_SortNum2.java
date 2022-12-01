import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class BOJ2751_SortNum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        // Arrays.sort는 QuickSort 알고리즘 사용 -> 최선은 O(nlogn)이지만
        // 최악의 경우 O(n^2)가 된다. (최악: 오름차순, 내림차순 정렬이 되어있을 경우)

        // Collections.sort를 사용하면 Merge Sort와 Insert Sort를 합친 Timsort 알고리즘 사용
        // 시간 복잡도 O(n) ~ O(nlogn)

        for(int i=0; i<N; i++){
            bw.write(list.get(i).toString());
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
