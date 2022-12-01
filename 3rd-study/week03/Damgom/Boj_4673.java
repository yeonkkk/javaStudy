public class Boj_4673 {
    public static void main(String[] args) {
        /*
        boj_4673 셀프넘버
        1부터 10000까지의 숫자 중 셀프넘버를 판별하고 출력한다

        셀프넘버 : 생성자가 없는 숫자

        1부터 10000까지 전부 검사하여 그 숫자를 생성자로 하는 숫자를 체크한다
        1을 생성자로 갖는 숫자 -> 1 + 1 = 2 -> 2는 셀프넘버가 아니다
        2를 생성자로 갖는 숫자 -> 2 + 2 = 4
        3을 생성자로 갖는 숫자 -> 3 + 3 = 6 -> 3은 셀프넘버가 아니다
        11을 생성자로 갖는 숫자 -> 11 + 1 + 1 -> 14
         */
        boolean[] check = new boolean[10001];

        for(int i = 1; i < 10001; i++) {
            int n = selfNum(i);
            if(n < 10001) {
                check[n] = true;
            }
        }

        for(int i = 1; i < 10001; i++) {
            if(!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static int selfNum(int number) {
        int temp = number;

        while(number != 0) {
            temp = temp + (number % 10);
            number /= 10;
        }

        return temp;
    }
}