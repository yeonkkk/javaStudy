// 곱셈
import java.io.*;

public class BJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        int sum = 0;

        for (int i = 2; i >= 0; i--) {
            int result = num1 * Character.getNumericValue(num2.charAt(i));
            bw.write(String.format("%d%n", result));
            sum += result * Math.pow(10, 2-i);
        }

        bw.write(String.valueOf(sum));
        br.close();
        bw.close();
    }
}
