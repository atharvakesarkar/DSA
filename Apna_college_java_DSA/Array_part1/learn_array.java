
import java.util.*;

public class learn_array {

    // ----------------------------------------array as a function argument----------------------------------------
    public static void array_plus(int exam_marks[]) {
        for (int i = 0; i < exam_marks.length; i++) {
            exam_marks[i] = exam_marks[i] + 1;
        }
    }

    // ------------------------------------------------linearSearch------------------------------------------------
    public static int linearSearch(int num_array[] , int key) {
       
       
        for (int i = 0; i < num_array.length; i++) {
            // System.out.println(num_array[i]);
            if (num_array[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int  foodSearch(String food_menu[] , String choose){

        for (int i = 0; i < food_menu.length; i++){
            // System.out.println(food_menu[i]);
            if (food_menu[i].equals(choose)){
                return i;
            }
        }
        return -1;
    }

    // --------------------------------------- largest number is array --------------------------------------------
    public static void   largNum(int allNum[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i = 0; i < allNum.length; i++){

            if (allNum[i] > largest){
                largest = allNum[i];
            }

            if (allNum[i] < smallest){
                smallest = allNum[i];                
            }


        }

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);

    }


    // --------------------------------------------main function starts--------------------------------------------
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
        // System.out.println("enter your physics marks : ");
        // marks[0] = sc.nextInt();
        // System.out.println("enter your maths marks : ");
        // marks[1] = sc.nextInt();
        // System.out.println("enter your chemistry marks : ");
        // marks[2] = sc.nextInt();
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
        // ----------------------------------array passing as a function argument----------------------------------
        int exam_marks[] = {90, 86, 82};
        array_plus(exam_marks);

        for (int i = 0; i < exam_marks.length; i++) {
            // System.out.print(exam_marks[i] + " ");
        }
        // System.out.println();

        //-----------------------------------------linear search in array-----------------------------------------
        // int num_array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};

        // // System.out.print("enter a number for search: ");
        // // int key = sc.nextInt();

        // int index = linearSearch(num_array, key);
        // if (index == -1){
        //     // System.out.println(key + " not found ");
        // } else {

        // // System.out.println(key + " present at index no. " + index);
        // }


        // String food_menu []= { "vadapav" , "cholaa" , "meduvada" , "momos" , "samosa" , "sabji roti" , "masala dosa" , "popcorn"};

        // System.out.print("enter your food choice: ");
        // String choose = sc.next();
        // choose.toLowerCase();

        // int foodIndex = foodSearch(food_menu, choose);

        // if (foodIndex == -1){
        //     System.out.println(choose + " is not found");
        // } else {
        //     System.out.println(choose + " is found on index no " + foodIndex);

        // }

        // --------------------------------------------------------------------------------------------------------
        // ----------------------------------------largest number is array----------------------------------------

        int allNum[] = {2,4,11,6,8};
        // largNum(allNum);

        // --------------------------------------------------------------------------------------------------------
        // ----------------------------------------------Binary Search---------------------------------------------

        let binarr [] = {2,4,6,8,10,11,12};
 

    }

}
