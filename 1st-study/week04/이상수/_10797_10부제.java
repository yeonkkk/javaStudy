package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _10797_10부제 {
    static void sol(int n, List<Integer> cars){
        int result = (int)cars.stream().filter(x -> x%10 == n).count();
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        String[] temps = br.readLine().split(" ");
        List<Integer> cars = Arrays.stream(temps).map(x -> Integer.valueOf(x))
                .collect(Collectors.toList());

        int[] result = Arrays.stream(temps).mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(result));

        sol(num,cars);
    }
}
