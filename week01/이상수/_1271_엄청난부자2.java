package week1;
import java.math.BigInteger;
import java.util.*;

public class _1271_엄청난부자2 {
    static void shareMoney(BigInteger money, BigInteger creature){
        System.out.println(money.divide(creature));
        System.out.println(money.remainder(creature));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger money = scanner.nextBigInteger();
        BigInteger creature = scanner.nextBigInteger();

        shareMoney(money,creature);
    }
}
