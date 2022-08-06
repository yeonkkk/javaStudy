package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _2489_주사위세개 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(" ");
        List<Integer> result = Arrays.stream(array).map(Integer::parseInt).collect(Collectors.toList());

        int num1 = result.get(0);
        int num2 = result.get(1);
        int num3 = result.get(2);

        if(num1 == num2 && num2 == num3){
            bw.write(10000+num1*1000+"");
        }else if(num1 == num2 || num2==num3 || num3 == num1){
            int out = num1==num2 ? num1 : (num2==num3 ? num2 : num3);
            bw.write(1000+out*100 + "");
        }else{
            int out = result.stream().mapToInt(x -> x).max().orElse(0);
            bw.write(out*100+"");
        }
        bw.flush();
        bw.close();
    }
}
