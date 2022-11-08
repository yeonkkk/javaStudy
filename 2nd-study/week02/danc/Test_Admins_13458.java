package season2;

import java.util.Scanner;

public class Test_Admins_13458 {

    //simple calculation

    /*
    * 1. check room by room
    * 2. total students in one room - chiefCoverage - asstCoverage(as many as possible)
    * 3. Only one ChiefAdmin can exist per room. AsstAdmin should cover the rest.
    * */

    private static long solution(int[] numOfStudentsPerSpaces, int chiefAdminCoverage,
                                int asstAdminCoverage) {
        long chiefCount = 0;
        long asstCount = 0;

        for(int i=0; i<numOfStudentsPerSpaces.length; i++){
            //chief can cover all
            if(numOfStudentsPerSpaces[i] - chiefAdminCoverage <= 0) {
                chiefCount++; continue;
            } else { //chief + asst(as many as possible)
                chiefCount++; //only one chief per room

                //AsstAdmin will cover rest. Must calculate after deducting chief's coverage from total student as one chief must exist per room.
                asstCount +=
                        //check if there is any leftover when students number-chiefCoverage is divided by asstAdminCoverage
                        (numOfStudentsPerSpaces[i]-chiefAdminCoverage)%asstAdminCoverage==0
                                ? (numOfStudentsPerSpaces[i]-chiefAdminCoverage)/asstAdminCoverage

                                //leftover means one more asstAdmin is required.
                                : (numOfStudentsPerSpaces[i]-chiefAdminCoverage)/asstAdminCoverage+1;
            }
        }
        return chiefCount+asstCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSpaces = sc.nextInt();
        int[] numOfStudentsPerSpaces = new int[numOfSpaces];
        for(int i=0; i<numOfSpaces; i++) {
            numOfStudentsPerSpaces[i] = sc.nextInt();
        }
        int chiefAdminCoverage = sc.nextInt();
        int asstAdminCoverage = sc.nextInt();
        sc.close();

        System.out.println(solution(numOfStudentsPerSpaces,
                chiefAdminCoverage,asstAdminCoverage));
    }
}
