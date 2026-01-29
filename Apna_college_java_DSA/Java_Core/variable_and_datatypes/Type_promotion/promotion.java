//defination -  Type promotion is when Java automatically converts smaller data types into a bigger data type while evaluating an expression, so the calculation can be done safely.

//rules :-
//1. byte short and char are automatically converts smaller data types into bigger data type 
//2. if one operand in long, float , or double 
                                        // The entire expression is promoted to:
                                        // long if one operand is long
                                        // float if one operand is float
                                        // double if one operand is double

//-----------------------------------------------------------------------------------------------------------

public class promotion {
    public static void main(String args[]){

        // char a = 'a';
        // byte b = 10;

        // System.out.println(a + b);
        // System.out.println(a);

//------------------------------------------------------------------------------------------------------------ 
//Expression Type Promotion Order -- byte / short / char → int → long → float → double
 

        char a = 'a'; //unicode = 97 , converted into int 
        byte b = 25; //converted into int 
        short c = 200; //converted into int 
        long d= 239; //all become long 
        float e = 45.98f; //all become float 
        double f = 98.999909; //everything become double 
        
        System.out.println(a +b+c+d+e+f); //output = 705.97988946875

//-----------------------------------------------------------------------------------------------------------------














    }
}
