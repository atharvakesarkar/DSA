public class data_types {
    public static void main(String args[]){

        byte num = 127;
        System.out.println(num);

        Float num2 = 3.1456f;
        System.out.println(num2);

//------------------------------------------------------------------------------------------------------------

        char starting = 'A';
        System.out.println(starting);
   

//-------------------------------------------------------------------------------------------------------------
        boolean name = true;
        System.out.println(name);

    }
}

/*
Java Primitive Data Types

byte    : 8-bit signed integer
          Range: -128 to 127

short   : 16-bit signed integer
          Range: -32,768 to 32,767

int     : 32-bit signed integer
          Range: -2^31 to (2^31 - 1)

long    : 64-bit signed integer
          Range: -2^63 to (2^63 - 1)

float   : 32-bit floating point (single precision)
          Suffix: f or F

double  : 64-bit floating point (double precision)
          Default type for decimal values

char    : 16-bit Unicode character
          Range: 0 to 65,535

boolean : Stores true or false
          Size is JVM dependent (not defined in Java)
*/
