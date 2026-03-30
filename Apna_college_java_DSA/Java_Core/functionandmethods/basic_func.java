
// import java.util.*;
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
    //defined a function with parameters 
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    //------------------------------------------------------------------------
    //defined a function to swap the numbers:
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }

    // defined a function to return product of two numbers
    public static int product(int number1, int number2) {
        int sum = number1 * number2;
        return sum; //return is compulsary becasue return type is define as intger
    }

    public static void main(String args[]) {
        // functions - are the block of code that we need to repeat , so instead of writing it multiple time in program...define it in the function and just call it whenever it needed 

        // printhello(); //call printhello function
        // System.out.println(sum()); //call sum function
        //---------------------------------------------------------------------------------------------------------
        // two user input for num1 and num2 
        // Scanner scan = new Scanner(System.in); //created a object name as scan
        // System.out.print("ente a num1 value: ");
        // int num1 = scan.nextInt();
        // System.out.print("ente a num2 value: ");
        // int num2 = scan.nextInt();
        // System.out.println("addition value is: " + addition(num1, num2));
        //---------------------------------------------------------------------------------------------------
        //code for swaping two numbers 
        int a = 10;
        int b = 20;
        // int temp = b;
        // b = a;
        // a = temp;
        // System.out.println(a);
        // System.out.println(b);
        //--------------------------------------------------------------------------------------------------
        // calling a swap function
        // CALL BY VALUE :  it is a mechanism in which the value of variable is copied and passed  to a method, so any changes made inside the method affect only the copy , not the orginal variable 

        // swap(a, b);
        // System.out.println(a);
        // System.out.println(b);
        // orginal variable 
        int number1 = 5;
        int number2 = 2;

        System.out.println(product(number1, number2)); //passing the copy of number1 and number2 

    }
}
