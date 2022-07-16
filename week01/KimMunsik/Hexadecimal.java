//16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.
//첫째 줄에 16진수 수가 주어진다. 이 수의 최대 길이는 6글자이다. 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다. 또, 이 수는 음이 아닌 정수이다.
//첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.
//입력 예 : A
//출력 예 : 10
//출처 : rory143

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        //10진수 -> 16진수 String : Integer.toHexString(13);
        //16진수 -> 10진수 int : Integer.parseInt(s : String, radix : Int)
        //10진수 -> 2진수(toBinaryString)
        //8진수(toOctalString)
        //입력 메서드 scanner 적용

        Scanner scanner = new Scanner(System.in);

        String hexa = scanner.nextLine(); //문자 입력

        int decimal = Integer.parseInt(hexa,16); //16진수 -> 10진수 변환값

        if (hexa.length() <= 6 || decimal <= 15) { //6자리 이내, F값 이내
            System.out.println(decimal);
        } else if(hexa.length() > 6 /*|| decimal > 15*/) {
           return ;
        }
    }
}

//F 이상 문자에 대한 처리 방법???