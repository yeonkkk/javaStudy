package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _17608_막대기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        int count=1;
        int max = list.get(list.size()-1);
        for(int i= list.size()-1; i>=0; i--){
            if(max < list.get(i)){
                max = list.get(i);
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
