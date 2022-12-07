import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj_1620 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1620 나는야 포켓몬 마스터 이다솜, hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        Map<Integer, String> integerStringMap = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            stringIntegerMap.put(pokemon, i);
            integerStringMap.put(i, pokemon);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= m; i++) {
            String input = br.readLine();
            if(isNum(input)) {
                sb.append(integerStringMap.get(Integer.parseInt(input))).append("\n");
            }else sb.append(stringIntegerMap.get(input)).append("\n");
        }
        System.out.println(sb);
    }
    public static boolean isNum(String input) {
        return input.matches("^\\d*");
    }
}