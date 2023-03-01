import java.util.ArrayList;
import java.util.Collections;

/**
 * Leader
 */
public class Leader {

    public static void main(String[] args) {


        //fetch the result int arr[] = { 16, 17, 4, 3, 5, 2 }
        ArrayList<Integer> leaderInteger = new ArrayList<Integer>();

        //fetch the result int arr1[] = {1, 2, 3, 4, 5, 2};
        ArrayList<Integer> leaderInteger1 = new ArrayList<Integer>();

        //table array int  1
        int arr[] = { 16, 17, 4, 3, 5, 2 };

         //table array int  2
        int arr1[] = {1, 2, 3, 4, 5, 2};

        //max number of the table int arr[] = { 16, 17, 4, 3, 5, 2 };
        int maxLeader = 0;

        // //max number of the table  int arr1[] = {1, 2, 3, 4, 5, 2};

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > maxLeader) {

                maxLeader = arr[i];

                leaderInteger.add(maxLeader);

            }
        }

         //max number of the table  int arr1[] = {1, 2, 3, 4, 5, 2};

        int maxLeader1 = 0;

        //loop in  table int arr1[] = {1, 2, 3, 4, 5, 2};

        for (int i = arr1.length - 1; i >= 0; i--) {

            if (arr1[i] > maxLeader1) {

                maxLeader1 = arr1[i];

                leaderInteger1.add(maxLeader1);

            }
        }

        //reverse the result
        Collections.reverse(leaderInteger);

        //show the result of table 
        for (int i : leaderInteger) {

            System.out.println(i);

        }

        //reverse the result
        Collections.reverse(leaderInteger1);

         //show the result of table
        for (int i : leaderInteger1) {

            System.out.println(i);

        }

    }

}