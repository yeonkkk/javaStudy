import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj_2607 {
    /**
     * @Boj_2607 비슷한 단어
     * @Implementation,String
     */
    static int answer;
    static int targetLength;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String target = br.readLine();
        targetLength = target.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            char temp = target.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        answer = 0;
        for (int i = 0; i < n-1; i++) {
            String compare = br.readLine();
            HashMap<Character, Integer> cloneMap = (HashMap<Character, Integer>) map.clone();
            solution(cloneMap, compare);
        }
        System.out.println(answer);
    }
    public static void solution(Map<Character, Integer> map, String compare) {
        int count = 0;
        for (int i = 0; i < compare.length(); i++) {
            char temp = compare.charAt(i);
            if (map.containsKey(temp) && map.get(temp) != 0) {
                map.put(temp, map.get(temp) - 1);
                count++;
            }
        }
        if (targetLength - 1 == compare.length() && count == compare.length()) {
            answer++;
        }else if (compare.length() == targetLength) {
            if (count == targetLength - 1 || count == targetLength) {
                answer++;
            }
        }else if (compare.length() == targetLength + 1 && count == targetLength) {
            answer++;
        }
    }
}
