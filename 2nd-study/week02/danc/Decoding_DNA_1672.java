package season2;

import java.util.Scanner;

public class Decoding_DNA_1672 {
    // treat [AC - CA] like cases are equal.
    // AA BB CC DD = A B C D
    private static String decoding(String input, StringBuffer bf) {

        if(bf.length() == 1) return Character.toString(bf.charAt(0));

        char ans = ' ';

        //AA AG AC AT
        // GG GC GT
        //  CC CT
        //   TT
       for(int i=0; i<input.length(); i++){

           /*
           * assign last two character to An, An1
           * then delete from bf.
           * finally append to bf after tables()
           * */
           if(bf.length() > 3) {
               char An = bf.charAt(bf.length()-2);
               char An1 = bf.charAt(bf.length()-1);
               bf.delete(bf.length()-2, bf.length());
               bf.append(tables(An,An1));
           }
           else { // last three elements are calculated manually.
               char An = bf.charAt(0);
               char An1 = tables(bf.charAt(2), bf.charAt(1));
               ans = tables(An, An1);
           }
        }
       return Character.toString(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        StringBuffer bf = new StringBuffer();
        while (true) {
            bf.append(sc.nextLine());
            if(bf.length() == length) break;
        }
        sc.close();
        String input = bf.toString();

        System.out.println(decoding(input, bf));
    }

    // Only for decoding
    private static char tables(char An, char An1) {
        char ans = ' ';
        if(An == An1) return An;

        if((An == 'A' && An1 == 'G') || (An == 'G' && An1 == 'A')) {
            ans = 'C';
        }
        else if((An == 'A' && An1 == 'C') || (An == 'C' && An1 == 'A')) {
            ans = 'A';
        }
        else if((An == 'A' && An1 == 'T') || (An == 'T' && An1 == 'A')) {
            ans = 'G';
        }
        else if((An == 'G' && An1 == 'C') || (An == 'C' && An1 == 'G')) {
            ans = 'T';
        }
        else if((An == 'G' && An1 == 'T') || (An == 'T' && An1 == 'G')) {
            ans = 'A';
        }
        else if((An == 'C' && An1 == 'T') || (An == 'T' && An1 == 'C')) {
            ans = 'G';
        } return ans;
    }

}
