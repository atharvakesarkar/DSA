

public  class func_ques{

    // write a java method to complete the average of three numbers
    public static int isAvg(int num1 , int num2 , int num3){
        int result = (num1 + num2 + num3) / 3;
        return result;
    }
    
    // ------------------------------------------------------------------------------------------------------------
    // write a method names as isEven that accepts an int argument. the method should return true if the argument is even, or false otherwise, also write a program to test your method 

    public static boolean isEven(int num){
        if (num % 2 ==0){
            return true;
        } else {
            return false;
        }
    } 

    // ------------------------------------------------------------------------------------------------------------
    // write a java program to check if a number is palindrome in java

    public static void isPalindrome(int orginalNum){
        int mynum = orginalNum;
        int lastDigit;
        int reverseNum = 0;

        while (orginalNum > 0){
            lastDigit = orginalNum % 10; // lastDigit = 121 % 10 = 1
                                         // lastDigit = 12 % 10 = 2
                                         // lastDigit = 1 % 10 = 0  
            
            reverseNum = reverseNum * 10 + lastDigit; // reverseNum = 0 * 10 + 1 = 1
                                                      // reverseNum = 1 * 10 + 2 = 12
                                                      // reverseNum = 12 * 10 + 1 = 121                     
            
            orginalNum = orginalNum / 10; // orginalNum = 121 / 10 = 12
                                          // orginalNum = 12 / 10 = 1
                                          // orginalNum = 1 / 10 = 0   
                                          
        } 
        // System.out.println(reverseNum);
        
        if (mynum == reverseNum){
            System.out.println( mynum + " is palindrome number");
        } else {
            System.out.println(mynum + " is not a palindrome number");
        }

    }

    // ------------------------------------------------------------------------------------------------------------
    // write a java method to compute the sum of the digits is an intger 

    public static int   isSum(int num){

        int sum = 0;
        
        while(num > 0){
            int lastDigit = num % 10;
            sum =  sum + lastDigit;
            num = num / 10;
                   
        }    
        return sum;
        
    }
    // ------------------------------------------------------------------------------------------------------------


    // ------------------------------------------------------------------------------------------------------------

    public static void main(String args[]){
        // calling the isAvg function
        // System.out.println(isAvg(10, 10, 10));
        
        // --------------------------------------------------------------------------------------------------------
        // calling isEven function
        // System.out.println(isEven(11));
    
        // --------------------------------------------------------------------------------------------------------
        // calling ispalindrome function
        // isPalindrome(121);

        // --------------------------------------------------------------------------------------------------------
        System.out.print(isSum(12));
    
    
    
    
    
    
    }

}
