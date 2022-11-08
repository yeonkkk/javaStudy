package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _5543_상근날드 {
    static void sol(int one, int two, int three, int four, int five){
        List<Integer> burger = new ArrayList<>(List.of(one,two,three));
        int minPrice = burger.stream()
                .mapToInt(x -> x)
                .min().orElse(0);

        int drink = (four > five) ? five-50 : four - 50;

        System.out.println(minPrice+drink);
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
