
import java.util.*;

public class learn_array {

    public static void main(String args[]) {
        // --------------------------------------------empty int array-------------------------------------------- 
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            // System.out.println(num[i]);
        }

        // --------------------------------------------------------------------------------------------------------
        // -------------------------------------------empty string array-------------------------------------------
        String fruits[] = new String[10];

        for (int i = 0; i < fruits.length; i++) {
            // System.out.println(fruits[i]);
        }
        // --------------------------------------------------------------------------------------------------------
        // ------------------------------------------numerical type array------------------------------------------
        int number[] = {10, 20, 30, 40};

        for (int i = 0; i < number.length; i++) {
            // System.out.println(number[i]);
        }

        // --------------------------------------------------------------------------------------------------------
        // ----------------------------------------------string array----------------------------------------------
        String name[] = {"Atharva", "pranav", "preskha", "sanika", "manasvi", "aaradhya"};

        for (int i = 0; i < name.length; i++) {
            // System.out.println(name[i]);
        }

        // --------------------------------------------------------------------------------------------------------
        // ---------------------------------------input and output in array---------------------------------------
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);

        // taking input in array 
        System.out.println("enter your physics marks : ");
        marks[0] = sc.nextInt();
        System.out.println("enter your maths marks : ");
        marks[1] = sc.nextInt();
        System.out.println("enter your chemistry marks : ");
        marks[2] = sc.nextInt();

        // printing marks value 
        // System.out.println("physics marks : " + marks[0]);
        // System.out.println("maths marks : " + marks[1]);
        // System.out.println("chemistry marks : " + marks[0]);

        // updating array element
        // marks[2] = 100;
        // System.out.println("updated chemistry marks : " + marks[2]);

        // average of marks 
        double marks_avg = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println(marks_avg);

        // arrayname.length - to get length of array
        int len_array = marks.length;
        // System.out.println(len_array);

        // --------------------------------------------------------------------------------------------------------







































    }

}
