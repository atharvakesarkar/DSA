import java.util.*;
public class switch_case {
    public static void main(String args[]){


        // int num = 1;

        // switch (num) {
        //     case 1 : System.out.println("samosa");
        //               break;
        //     case 2 : System.out.println("burger");
        //               break;
        //     case 3 : System.out.println("Cold drink");
        //               break;
        //     default: System.out.println("wake up sid");
        // }


//---------------------------------------------------------------------------------------------------------------
// make the caluclator using switch case

        Scanner scan = new Scanner(System.in);

        System.out.print("enter your first number: ");
        int a = scan.nextInt();
        System.out.print("enter your second number: ");
        int b = scan.nextInt();
        System.out.print("enter your opertor: ");
        char operator = scan.next().charAt(0);

        switch (operator){
            case '+' : System.out.println("addition of a and b will be: " + (a+b));
                        break;
            case '-' : System.out.println("subtraction of a and b will be: " + (a-b));
                        break;
            case '*' : System.out.println("Multiplication of a and b will be: " + (a*b));
                        break;
            case '/' : System.out.println("divide of a and b will be: " + (a/b));
                        break;
            case '%' : System.out.println("Modolus of a and b will be: " + (a%b));
                        break;
            default: System.out.println("error: try again");
        }



    }
}