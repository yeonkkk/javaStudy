package week8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2309_일곱난쟁이 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result =0;
        List<Integer> list = new ArrayList<>();
        String str;

        for(int i=0; i<9; i++){
            str = br.readLine();
            int num = Integer.parseInt(str);
            result += num;
            list.add(num);
        }

        int diff = result - 100;

        List<Integer> remove = new ArrayList<>();
        boolean find = false;

        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if((list.get(i) + list.get(j)) == 40){
                    remove.add(list.get(i));
                    remove.add(list.get(j));
                    find = true;
                    break;
                }
            }
            if (find == true) break;
        }

        Collections.sort(list);
        for(int tmp : list){
            if(!remove.contains(tmp))
                bw.write(tmp + "\n");
        }

        bw.flush();
        bw.close();
    }
}
