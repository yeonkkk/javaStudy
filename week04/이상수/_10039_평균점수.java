package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _10039_평균점수 {
    static void sol(int one, int two, int three, int four, int five){
        List<Integer> tmp = new ArrayList<>(List.of(one,two,three,four,five));
        double result = tmp.stream()
                .map(x -> {
                    int trans;
                    trans = x > 40 ? x : 40;
                    return trans;
                })
                .mapToInt(x -> x)
                .average().orElse(0);

        System.out.println((int)result);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        StringTokenizer st4 = new StringTokenizer(br.readLine());
        StringTokenizer st5 = new StringTokenizer(br.readLine());



        sol(Integer.valueOf(st1.nextToken()),Integer.valueOf(st2.nextToken()),Integer.valueOf(st3.nextToken())
                ,Integer.valueOf(st4.nextToken()),Integer.valueOf(st5.nextToken()));
    }
}
