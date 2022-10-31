//두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오.
//첫째 줄에 A가, 둘째 줄에 B가 주어진다. 각각의 수는 10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.
//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A×B를 출력한다. 각각을 출력할 때, 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는 의미).
//입력 예 : 1
//        -1
//출력 예 : 0
//         2
//        -1

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력
        int a = scanner.nextInt(); //인자 1
        int b = scanner.nextInt(); //인자 2

        //계산식
        int c = a+b;
        int d = a-b;
        int e = a*b;

        //조건문
        if (a<=1000 && b<=1000){
            System.out.println("A+B = " + c);
            System.out.println("A-B = " + d);
            System.out.println("A*B = " + e);
        } else if(a>=-1000 && b>=-1000){
            System.out.println("A+B = " + c);
            System.out.println("A-B = " + d);
            System.out.println("A*B = " + e);
        } else {
            return;
        }
    }
}
