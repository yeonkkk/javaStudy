package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeFromRectangle_1085 {
    public static void main(String[] args) throws IOException {

        //현재위치: 한수의 좌표(x,y)에서

        //x 기준으로 (0까지의 거리가 짧은지, 꼭지점과 현재위치의 사이 거리가 짧은지)
        //y 기준으로 (0까지의 거리가 짧은지, 꼭지점과 현재위치의 사이 거리가 짧은지)

        //각각 비교해서 최소값을 뽑으면 된다.


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String temp = bf.readLine();
        bf.close();
        StringTokenizer tokenizer = new StringTokenizer(temp, " ");

        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());
        int h = Integer.parseInt(tokenizer.nextToken());

        int MIN_x_axis = Math.min(x, w - x);
        int MIN_y_axis = Math.min(y, h - y);

        System.out.println(
                Math.min(MIN_x_axis, MIN_y_axis));
    }
}
