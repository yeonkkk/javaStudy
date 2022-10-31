package week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _2161_카드1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        IntStream temp = IntStream.range(1,Integer.parseInt(st.nextToken())+1);
        List<Integer> list = temp.boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        int idx = 0;

        while(list.size() != 0){
            List<Integer> remain = new ArrayList<>();
            for(int i=0; i<list.size(); i++){
                if(idx %2 == 0){
                    result.add(list.get(i));
                }else{
                    remain.add(list.get(i));
                }
                idx++;
            }
            list = remain;
        }

        String show = "";
        for(Integer tmp : result){
            show += tmp + " ";
        }

        System.out.println(show.substring(0,show.length()-1));
    }
}
