//it can do all the same things that are done by while , the only differnece is syntax and you can see all the factos like intilization, condition , increment are written in one line and in middle they have stop " ; "

public class forloop {

    public static void main(String args[]) {

        // for (int i = 1; i < 5; i++) {
        //     System.out.println(i);
        // }
//------------------------------------------------------------------------------------------------------------
        //print square pattern    
        // for (int i = 1; i <= 4; i++) {
        //     System.out.println("****");
        // }
//-----------------------------------------------------------------------------------------------------------
        //print the reverse numbers.
        int n = 10899;
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }

        System.out.println(rev);

    }
}
