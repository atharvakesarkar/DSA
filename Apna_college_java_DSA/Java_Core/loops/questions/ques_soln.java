import java.util.*;

public class ques_soln {

    public static void main(String[] args) {

//q1. check if the number is print or not
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        boolean isprime = true;
        if (n == 2) {
            System.out.println("n is the prime number");
        } else {
            for (int i = 2; i < n - 1; i++) {
                if (n % 1 == 0) {
                    isprime = false;

                }
            }
            if (isprime == true) {
                System.out.println("n is a prime number");
            } else {
                System.out.println("n is not a prime number");
            }

        }

    }
}
