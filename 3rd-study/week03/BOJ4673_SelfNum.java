import java.util.ArrayList;
import java.util.List;

public class BOJ4673_SelfNum {
    public static void main(String[] args) {

        StringBuffer bf = new StringBuffer();
        boolean[] isNotSelfNum = new boolean[10001];

        //boolean배열을 통해서 셀프 넘버가 아닌것은 true, 셀프 넘버인 것은 false로 해놓고
        // 반복문을 통해 false조건에 걸리는 인덱스 넘버 반환
        for (int i = 0; i < isNotSelfNum.length; i++) {

            int check = selfnum(i);

            if (check < 10001) {
                isNotSelfNum[check] = true; // 셀프넘버가 아니면 true로 바꾼다
            }

            if(!isNotSelfNum[i]){ //SelfNum만 출력 (false인 것만)
                System.out.println(i);
            }
        }
    }

    //SelfNum 판별기
    //자기 자신 + 각 자리 수
    static int selfnum(int num) {
        int temp = num; // 자기 자신도 더해야함

        while (num > 0) {
            temp = temp + (num % 10); // 일의 자리수 더해가기
            num = num / 10;
        }
        return temp;
    }
}
