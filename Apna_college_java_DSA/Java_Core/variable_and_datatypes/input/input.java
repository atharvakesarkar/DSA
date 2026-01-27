import java.util.*;
public class input{
    public static void main(String args[]){


        // only capture the one stirng and ignore the line after the space 
        // Scanner sc = new Scanner(System.in); //made a object name as sc 
        // String firstname = sc.next(); //next() reads one word (stops at space),
        // System.out.println(firstname);
        
//--------------------------------------------------------------------------------------------------------------
        //by using the nextline , it will take the complete string
        // Scanner scn = new Scanner(System.in);
        // String fullname = scn.nextLine(); // nextLine() reads the full line (until you press Enter).
        // System.out.println(fullname);
        
 //------------------------------------------------------------------------------------------------------------
 //     Example of every datatype

        // example for intger     

        // Scanner s = new Scanner(System.in);
        // System.out.print("enter a number: ");
        // int num = s.nextInt();
        // System.out.println("user input is: " + num);

//_____________________________________________________________________________________
        //example for long 

        // Scanner scan = new Scanner(System.in);
        // System.out.print("enter a number to watch the example of long data type: ");
        // long number = scan.nextLong();
        // System.out.print(number);


//_____________________________________________________________________________________
        //  example for Float 
        // Scanner athu = new Scanner(System.in);
        // System.out.print("enter a float number to get a example for nextFloat: ");
        // float floating = athu.nextFloat();
        // System.out.println(floating);
        
//_____________________________________________________________________________________
        // example for double 
        // Scanner snc = new Scanner(System.in);
        // System.out.print("enter a number for getting the example of double: ");
        // double doub = snc.nextDouble();
        // System.out.println(doub);

//_____________________________________________________________________________________
        //example for Boolean 
        // Scanner bool = new Scanner(System.in);
        // System.out.print("enter a boolean value [true or false] ,  to get a example of boolean: ");
        // boolean tf = bool.nextBoolean();
        // System.out.println(tf);

//_____________________________________________________________________________________

        //example of Byte 
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number to get example of byte: ");
        Byte num1 = scanner.nextByte();
        System.out.println(num1);
    }
}