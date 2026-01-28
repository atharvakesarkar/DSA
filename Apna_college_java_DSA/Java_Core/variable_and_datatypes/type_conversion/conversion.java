// Type conversion is the process of changing a value from one data type to another.
// __________________________________________________________________________________________
// The destination type must be bigger  - int → float, float → double
//The types must be compatible - int → double is valid, int → String is not (without special methods).
//_____________________________________________________________________________________________

public class conversion{

    public static void main(String args[]){
    
        //you can make the conversion only smaller to bigger one 
        // int a = 25;
        // long b = a;
        // System.out.println(b);

// ------------------------------------------------------------------------------------------------------------------
        //you cannot make the conversion bigger to smaller one
        //this is called lossy conversion
        // long  a = 25;
        // int b = a;
        // System.out.println(b);
   

// -------------------------------------------------------------------------------------------------------------
        //conversion can only be done in compitable data types 
        // int num = 25;
        // String num2 = num;   //error - int cannot be converted into string 

        // System.out.print(num2);

        

    }
}