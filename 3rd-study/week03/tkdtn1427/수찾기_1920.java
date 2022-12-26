package backJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

//public class 수찾기_1920 {
//    static TreeMap<Integer, Integer> map;
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        map = new TreeMap<>();
//
//        StringBuilder sb  =new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<N; i++){
//            int data = Integer.parseInt(st.nextToken());
//            map.put(data, 0);
//        }
//
//        int M = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<M; i++){
//            int data = Integer.parseInt(st.nextToken());
//            if(map.keySet().contains(data)) sb.append(String.valueOf(1)).append("\n");
//            else sb.append(String.valueOf(0)).append("\n");
//        }
//
//        System.out.println(sb.toString());
//
//    }
//}






public class 수찾기_1920 {
    static List<Integer> list ;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();

        sb  =new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            int data = Integer.parseInt(st.nextToken());
            addData(data);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            int data = Integer.parseInt(st.nextToken());
            search(data);
        }

        System.out.println(sb.toString());
    }

    static void addData(int data){
        int left = 0;
        int right = list.size()-1;
        int mid;

        while (left <= right){
            mid = (left + right) / 2;

            if(list.get(mid) <data){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        list.add(left, data);
    }

    static void search(int data){
        int left = 0;
        int right = list.size()-1;
        int mid;

        while (left <= right){
            mid = (left + right) / 2;

            if(list.get(mid) == data){
                sb.append("1").append("\n");
                return;
            }

            if(list.get(mid) < data){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        sb.append("0").append("\n");
    }
}
