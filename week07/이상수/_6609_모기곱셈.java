package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _6609_모기곱셈 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] per;
        String isnull;
        int u;
        int b;
        int m;

        while ((isnull = br.readLine()) != null){
            per = Arrays.stream(isnull.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            for(int i=0; i<per[6]; i++){
                u = per[0]*per[3];
                b = per[2]/per[4];
                m = per[1]/per[5];
                per[0] =m;
                per[1] = b;
                per[2] = u;
            }
            System.out.println(per[0]);
        }
    }
}