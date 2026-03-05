
public class pattern {

    public static void main(String args[]) {

        // star pattern triangle....
        // * 
        // **
        // ***        
        // ****
        // for (int i = 1; i <= 4; i++) {
        //     // System.out.println("*");
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//----------------------------------------------------------------------------------------------------------------
        // print inverted-star pattern
        // **** 
        // *** 
        // ** 
        // *
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= (n - i + 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//----------------------------------------------------------------------------------------------------------------
        // print half pyramid pattern
        // int n = 4;
        // for (int line = 1; line <= n; line++) {
        //     for (int number = 1; number <= line; number++) {
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }
//----------------------------------------------------------------------------------------------------------------
        // print character pattern
        int n = 4;
        char ch = 'A';

        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
