import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2477 {
    public static void main(String[] args) throws IOException {
        /**
         * @boj_2477 참외밭
         * @Implementation,Geometry
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int volume = 0;
        int maxVolume = 0;
        for (int i = 0; i < 5; i++) {
            int temp = arr[i] * arr[i + 1];
            if (temp > maxVolume) {
                maxVolume = temp;
            }
            volume += temp;
        }
        int temp = arr[0] * arr[5];
        volume += temp;
        if (temp > maxVolume) {
            maxVolume = temp;
        }
        int result = (volume - maxVolume * 2) * k;
        System.out.println(result);
    }
}
