import java.util.*;

public class produc {
    public static void main(String args[]){
        //creating two objects to store two input
        Scanner sn = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

//------------------------------------------------------------------------------------------------------
        //creating two varibale to store the value getting from the user
        System.out.print("enter num1 value: ");
        int num1 = sn.nextInt();
        System.out.print("enter num2 value: ");
        int num2 = scn.nextInt();


        int product = num1 * num2;
        System.out.println(product);




    }
}