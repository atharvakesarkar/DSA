import java.util.*;
public class ternary{
    public static void main(String args[]){

//Ternary opertor - is a conditional opertor that checks a condition and returns one of two values based on whether the condition is true or false, all single line 

//SYNTAX : condition?statment1 : statement2

//---------------------------------------------------------------------------------------------------------------

        // int num = (4>5)?4:5;
        // System.out.println(num);
//---------------------------------------------------------------------------------------------------------------

        // int num1 = 11;

        // String type = num1%2==0?"even":"odd";
        // System.out.println(type);

//-----------------------------------------------------------------------------------------------------------------
    //check if the student is passed or failed
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your marks: ");
    int marks = sc.nextInt();


    String result = (marks>=33)? "passed":"failed"; 
    System.out.println(result);

    }

}