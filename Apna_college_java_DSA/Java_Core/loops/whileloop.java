
import java.util.*;

public class whileloop {

    public static void main(String[] args) {
        // int i = 1;
        // while (i < 10) {
        //     System.out.println("hello world");
        //     i++;
        // }

//------------------------------------------------------------------------------------------
        //print number 1 to 10
        // int num = 1;
        // while (num <= 10) {
        //     System.out.println(num);
        //     num++;
        // }
//------------------------------------------------------------------------------------------
        //print numbers 1 to n
        Scanner scan = new Scanner(System.in);
        // int i = 1;
        // System.out.print("enter the number, where loop should end: ");
        // int n = scan.nextInt();
        // while (i <= n) {
        //     System.out.println(i);
        //     i++;
        // }
//---------------------------------------------------------------------------------------
        //print sum of first natural numbers

        int i = 1;

        System.out.print("enter the range: ");
        int range = scan.nextInt();
        int sum = 0;

        while (i <= range) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
