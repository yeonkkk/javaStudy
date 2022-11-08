import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon15964_StrangeSymbol {
    public static void main(String[] args) throws IOException {
        //콘솔에서 입력 2개 받고 String -> Integer로 형변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long input1 = Long.parseLong(br.readLine());
        long input2 = Long.parseLong(br.readLine());

        System.out.println((input1 + input2) * (input1 - input2));
    }
}

/** 아래 BufferedReader 사용하니 런타임 에러가 나온다.. 이유는 모르겠다.
 *
 * public class baekjoon15964_StrangeSymbol {
 *     public static void main(String[] args) throws IOException {
 *         //콘솔에서 입력 2개 받고 String -> Integer로 형변환
 *         Scanner sc = new Scanner(System.in);
 *
 *         long input1 = sc.nextLong();
 *         long input2 = sc.nextLong();
 *
 *         System.out.println((input1 + input2) * (input1 - input2));
 *     }
 * }
 */