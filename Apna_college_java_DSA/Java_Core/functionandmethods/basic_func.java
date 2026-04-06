
import java.util.*;

public class basic_func {

    // defined a function to print "Hello" 
    // public static void printhello() {
    //     System.out.println("Hello");
    // }
    //----------------------------------------------------------------------
    // defined a funciton to add 10 + 10 
    // public static int sum() {
    //     return 10 + 10;
    // }
    //-----------------------------------------------------------------------
    //------------------------------------ defined a function with parameters ------------------------------------ 
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    //------------------------------------------------------------------------
    //---------------------------------- defined a function to swap the numbers: ----------------------------------
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }

    // --------------------------- defined a function to return product of two numbers ----------------------------
    public static int product(int number1, int number2) {
        int sum = number1 * number2;
        return sum; //return is compulsary becasue return type is define as intger
    }

    // --------------------------------- function for getting factorail of number ---------------------------------
    public static int fact_func(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //  ------------------------------- function for getting binominal coefficient ------------------------------- 
    public static int bino_coeff(int n, int r) {
        int n_value = fact_func(n);
        int r_value = fact_func(r);
        int n_minus_r = n - r;

        return n_value / (r_value * fact_func(n - r));
    }

    //--------------------------------------------Function overloading--------------------------------------------
    public static int sum(int value_1, int value_2) {
        return value_1 + value_2;
    }

    public static float sum(float value_1, float value_2) {
        return value_1 + value_2;
    }

    public static int sum(int value_1, int value_2, int value_3) {
        return value_1 + value_2 + value_3;
    }

    // // ---------------------------------function to find if number is prime or not---------------------------------
    // public static boolean isprime(int n) {
    //     boolean isprime = true;
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             isprime = false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }
    // ------------------------function to find if number is prime or not in optimized way------------------------
    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    // ------------------------------------------------------------------------------------------------------------
    // --------------------------------------print all prime number in range---------------------------------------
    public static void primesinrange(int n) {

        for (int i = 2; i <= n; i++) {

            if (isprime(i) == true) {
                System.out.print(i + " ");
            }

        }

    }

    // ----------------------------------------------------------------------------------------------------------
    // -------------------------------- Main function starts from here --------------------------------------------
    public static void main(String args[]) {
        // functions - are the block of code that we need to repeat , so instead of writing it multiple time in program...define it in the function and just call it whenever it needed 

        // printhello(); //call printhello function
        // System.out.println(sum()); //call sum function
        //---------------------------------------------------------------------------------------------------------
        // two user input for num1 and num2 
        Scanner scan = new Scanner(System.in); //created a object name as scan
        // System.out.print("ente a num1 value: ");
        // int num1 = scan.nextInt();
        // System.out.print("ente a num2 value: ");
        // int num2 = scan.nextInt();
        // System.out.println("addition value is: " + addition(num1, num2));
        //---------------------------------------------------------------------------------------------------
        //---------------------------------- code for swaping two numbers -----------------------------------
        int a = 10;
        int b = 20;
        // int temp = b;
        // b = a;
        // a = temp;
        // System.out.println(a);
        // System.out.println(b);
        //--------------------------------------------------------------------------------------------------
        // ------------------------------------- calling a swap function ------------------------------------
        // CALL BY VALUE :  it is a mechanism in which the value of variable is copied and passed  to a method, so any changes made inside the method affect only the copy , not the orginal variable 

        // swap(a, b);
        // System.out.println(a);
        // System.out.println(b);
        // orginal variable 
        int number1 = 5;
        int number2 = 2;

        // System.out.println(product(number1, number2)); //passing the copy of number1 and number2 
        //-----------------------------------------------------------------------------------------------------------
        // ----------------------------------- find the factorial of the number -----------------------------------
        // System.out.print("Enter a number of which you need a factorial: ");
        // int n = scan.nextInt();
        // System.out.println(fact_func(n));
        // --------------------------------------------------------------------------------------------------------
        // ------------------------- find the Binominal coefficent -----------------------------------------
        // System.out.println("Enter a number of which you need a nCr: ");
        // int r = scan.nextInt();
        // System.out.println(bino_coeff(n, r));
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------Function overloading----------------------------------------
        // Function overloading - multiple function of same name but different parameter....
        int value_1 = 10;
        int value_2 = 20;
        int value_3 = 50;

        // System.out.println(sum(value_1, value_2));
        // System.out.println(sum(value_1, value_2, value_3));
        float result = sum(1.4f, 1.5f);
        // System.out.println(result);

        // ----------------------calling function for checking if the number is prime or not----------------------
        // System.out.println(isprime(12));
        // -----------calling function for checking if the number is prime or not for the optimized one-----------
        // System.out.println(isprime(12));
        //--------------------------------------------------------------------------------------------------------
        // -----------------------calling the function that print all prime number in ranges-----------------------
        primesinrange(20);

    }
}
