import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_20920 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_20920 영단어 암기는 괴로워
         * @sort,hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> word = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            if (temp.length() >= m) {
                word.put(temp, word.getOrDefault(temp, 0) + 1);
            }
        }
        List<String> list = new ArrayList<>(word.keySet());
        list.sort((o1, o2) -> {
            if (word.get(o1).equals(word.get(o2))) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }return o2.length() - o1.length();
            }return word.get(o2) - word.get(o1);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
