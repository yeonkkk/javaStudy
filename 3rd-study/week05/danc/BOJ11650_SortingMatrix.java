import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11650_SortingMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        int[][] matrix = new int[N][2];
        for(int i=0; i<N; i++) {
            tk = new StringTokenizer(br.readLine());
            matrix[i][0] = Integer.parseInt(tk.nextToken()); // x
            matrix[i][1] = Integer.parseInt(tk.nextToken()); // y
        }
        //2차원 배열의 정렬은 Comparator을 오버라이딩 해서 사용할 수 있음
        // 아니면 람다식을 써서 해결 가능
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        for(int i=0; i<N; i++){
            System.out.println(matrix[i][0] + " " + matrix[i][1]);
        }
    }
}
