//continue statment is use for skipping the iteration

import java.util.*;

public class continue_con {

    public static void main(String[] args) {

        // for (int num = 1; num <= 5; num++) {  //ouput - 1,2,4,5
        //     if (num == 3) {
        //         continue;
        //     }
        //     System.out.println(num);
        // }
// display all numbers entered by the user except multiple of 10
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter a number: ");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                continue;
            }
            System.out.println(num);
        }

    }

}
