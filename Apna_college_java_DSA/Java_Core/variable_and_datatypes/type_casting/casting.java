//Type casting means manually changing one data type into another


//rules :-
// 1. it is used when converting a bigger data type to a smaller one 
// 2. You must explicitly mention the target data type.
// 3.Data loss can happen because the smaller data type cannot store all values of the bigger one.
// 4.Decimal values may be lost when converting to integer types.


public class casting {
    
    public static void main(String args[]){

//----------------------------------------------------------------------------------------------------------------
        //in this the float has be converted into the int

        // float num = 45.234f; //it is the decimal value 
        // int num1 = (int) num; //due the type casting into the int , the value is stored in num1 is 45 

        // System.out.println(num1); //output - 45

// ----------------------------------------------------------------------------------------------------------------
        //here the num varible that contain int data type has type casted too float..so the output has came in deciaml 
        // int num = 21;

        // float number = (float)num;

        // System.out.println(number); //output - 21.0

//-----------------------------------------------------------------------------------------------------------------
        //converting character into a number 
        //every alphabet has a number called as unicode , so when we converted char into a intger it has give us the unicode of 'A'

        char alp = 'A';

        int aplnum = (int) alp;

        System.out.println(aplnum);

    }
}