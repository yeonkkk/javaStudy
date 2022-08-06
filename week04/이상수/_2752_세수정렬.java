package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _2752_세수정렬 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).sorted()
                .collect(Collectors.toList());

        for (int i=0; i<result.size(); i++){
            if(i != 0) System.out.print(" ");
            System.out.print(result.get(i));
        }
    }
}
