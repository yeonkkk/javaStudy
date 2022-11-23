package season2;

import java.io.*;
import java.util.StringTokenizer;

public class Math_For_Grade6_2702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;
        int cases = Integer.parseInt(br.readLine());

        //테스트 케이스 받고
        //2개의 정수를 받는 과정에서 StringTokenizer 사용했습니다!
        for(int i=0; i<cases; i++) {
            tk = new StringTokenizer(br.readLine());
            bw.write(lcd(tk));
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static String calc(StringTokenizer tk) {

        //StringTokenizer를 여기서 nextToken()을 통해 분리
        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        StringBuffer bf = new StringBuffer();
        int min = 0;
        int max = 0;

        //최대공약수
        // 같이 나눠 떨어지는 것들 중 가장 큰 숫자를 구해야함.
        // i 루프가 끝날때까지 a와 b를 i로 나눈 나머지가 0인경우 계속 max에 누적
        // break가 없으니 루프를 끝까지 돌게되고 남아있는 max가 최대 공약수가 된다.
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i ==0){
                max = i;
            }
        }

        //최소공배수
        // 두 자연수의 곱 = 최대 공약수 * 최소 공배수 (공식)
        // (a*b) == max * min
        // min == (a*b)/max
        min = (a*b)/max;

        //StringBuffer로 공백 추가해서 붙이기
        bf.append(Integer.toString(min)); bf.append(" ");
        bf.append(Integer.toString(max));
        return bf.toString();
    }

    ///////////////////

    public static String lcd(StringTokenizer tk) {
        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        StringBuffer bf = new StringBuffer();
        int min = 0;
        int max = 0;

        //최대 공약수
        max = gcd(a,b);

        //최소 공배수 (공식 사용)
        min = a * b / max;

        bf.append(Integer.toString(min)); bf.append(" ");
        bf.append(Integer.toString(max));
        return bf.toString();
    }
    //유클리드 호제 (최대 공약수에서 사용)- 두 자연수를 서로 나눈것을 이용해서 계속 나눠감
    // 기원전 300년에 나온 알고리즘
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }




}
