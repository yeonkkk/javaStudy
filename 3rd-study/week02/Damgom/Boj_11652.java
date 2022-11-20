import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_11652 {
    public static void main(String[] args) throws IOException {
        /*
        boj_11652 카드, 실버4
        해시
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> numberCard = new HashMap<>();
        for(int i = 0; i < n; i++) {
            Long temp = Long.parseLong(br.readLine());
            numberCard.put(temp, numberCard.getOrDefault(temp, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        List<Integer> values = new ArrayList<>(numberCard.values());
        for(int i = 0; i < values.size(); i++) {
            if(values.get(i) > max) {
                max = values.get(i);
            }
        }
        Long min = Long.MAX_VALUE;
        for (Long key : numberCard.keySet()) {
            if(numberCard.get(key) == max && min > key) {
                min = key;
            }
        }
        System.out.println(min);
    }
}