package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class _10101_삼각형외우기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=2; i++) list.add(Integer.parseInt(br.readLine()));

        int sum = list.stream().mapToInt(x -> x).sum();

        if(list.get(0) == list.get(1) && list.get(1) == list.get(2)){
            bw.write("Equilateral");
        }else if(sum == 180){
            String result = list.get(0) == list.get(1) ? "Isosceles" : list.get(1) == list.get(2) ? "Isosceles" : list.get(2) == list.get(0) ? "Isosceles" : "Scalene";
            bw.write(result);
        }else{
            bw.write("Error");
        }

        bw.flush();
        bw.close();

    }
}
