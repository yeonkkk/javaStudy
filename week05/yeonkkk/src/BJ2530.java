// 인공지능 시계
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BJ2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int D = Integer.parseInt(br.readLine());

        B += D / 60;
        C += D % 60;

        B += C / 60;
        C = C % 60;

        A += B / 60;
        B = B % 60;

        A = A % 24;

        bw.write("" + A + " " + B + " " + C);
        br.close();
        bw.close();
    }
}

/** 런타임 에러 코드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int d = Integer.parseInt(br.readLine());

        bw.write(Arrays.stream(clock(arr, d)).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        br.close();
        bw.close();
    }

    public static int[] clock(int[] arr, int sec) {

        int[] time = {3600, 60, 1};

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                arr[i] += sec / time[i];
                sec = sec % time[i];
            } else arr[i] += sec;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= 60) {
                arr[i - 1] += arr[i] / 60;
                arr[i] = arr[i] % 60 ;
            }

            if (i == 0 && arr[i] >= 24) arr[i] = arr[i] / 24 - 1;
        }
        return arr;
    }
}
**/