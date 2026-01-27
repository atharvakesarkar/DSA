import java.util.*;
public class sum{

    public static void main(String args[]){

        // creating a object sn and scn 
        Scanner sn = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

//-----------------------------------------------------------------------------------------
        //creating a varible name as num1 and num2
        System.out.print("enter your num1 value: ");
        int num1 = sn.nextInt();
        System.out.print("enter your num2 value: ");
        int num2 = scn.nextInt();

        int soln = num1 + num2;
        System.out.println(soln);
        


    }

}