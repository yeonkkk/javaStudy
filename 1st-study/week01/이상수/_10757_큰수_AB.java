package week1;
import java.math.BigInteger;
import java.util.*;


public class _10757_큰수_AB {
    static void cal_BigNum(BigInteger first, BigInteger second){
        System.out.println(first.add(second));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger first = sc.nextBigInteger();
        BigInteger second = sc.nextBigInteger();

        cal_BigNum(first,second);
    }
}
