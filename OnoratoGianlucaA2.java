import static java.lang.System.*;
import java.util.Scanner;
import java.util.Arrays;

public class OnoratoGianlucaA2 {
    public static void main (String[] args){
        out.println("Enter length of array: ");
        Scanner y = new Scanner(System.in);

        int n = y.nextInt();

        int array[] = new int[n];

        out.println("Enter " + n + " elements");
        //Scanner elements = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            array[i] = y.nextInt();
        }

        out.println("Enter length of second array: ");

        int x = y.nextInt();

        int array2[] = new int[x];

        out.println("Enter " + x + " elements of second array: ");

        for(int i = 0; i < x; i++){
            array2[i] = y.nextInt();
        }

        if (Arrays.equals(array, array2))
            out.println("Arrays are equal");
        else{
            //int sum = IntStream.of(array).sum();
            //int sum2 = IntStream.of(array2).sum();
            //out.println(sum + " " + sum2);
            out.println("Arrays are not equal");
            int sum = 0;
            int sum2 = 0;
            for (int i:array) sum +=i;
            for (int i:array2) sum2 +=i;
            out.println("Array 1 sum: " + sum);
            out.println("Array 2 sum: " + sum2);
            if (sum == sum2)
                out.println("Arrays are equal");
            else if (sum > sum2)
                out.println("Array 1 is greater than Array 2");
            else if (sum < sum2)
                out.println("Array 2 is greater than Array 1");
        }

        out.println("Program Completed");

        /*for(int i: array){
            for(int z: array2){
                out.println(i + " " + z);
            }
        }*/

    }
}
/*
Sources:
https://stackoverflow.com/questions/25444786/taking-user-input-array-in-java-using-scanner-class
https://www.geeksforgeeks.org/compare-two-arrays-java/
https://stackoverflow.com/questions/4550662/how-do-you-find-the-sum-of-all-the-numbers-in-an-array-in-java
https://www.javatpoint.com/java-if-else
 */