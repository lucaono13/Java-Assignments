import java.util.Scanner;

public class OnoratoGianlucaA1 {
    public static void main(String[] args) {
        // Asks the user to input 3 integers
        System.out.println("Provide 3 integers below:");
        Scanner Scan1 = new Scanner(System.in);

        //Stores each integer provided by the user into a variable (x, y, or z)
        int x = Scan1.nextInt();
        int y = Scan1.nextInt();
        int z = Scan1.nextInt();

        //Checks to make sure that none of the sides are either 0 or negative
        if(x > 0 && y > 0 && z > 0) {
            /* Adds two sides together and compares it to the remaining side to
            check if the two sides are greater than the third when added */
            if (x + y > z && y + z > x && z + x > y) {

                //Prints out that the three sides can form a triangle and prints that the program is completed.
                System.out.println("Sides (" + x + ", " + y + ", " + z + ") can form a triangle!");
                System.out.println("Program Completed");
            } else {

                //Prints out that the three sides cannot form a triangle and prints that the program is completed.
                System.out.println("Sides (" + x + ", " + y + ", " + z + ") cannot form a triangle!");
                System.out.println("Program Completed");
            }
        } else {
            //If any of the numbers are negative or are zero, then it prints out that the sides cannot form a triangle.
            System.out.println("Sides (" + x + ", " + y + ", " + z + ") cannot form a triangle!");
            System.out.println("Program Completed");
        }


    }
}

//Sources:
//https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
//https://www.w3schools.com/java/java_user_input.asp