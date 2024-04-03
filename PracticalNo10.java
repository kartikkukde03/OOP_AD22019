/**Aim:Design a Java 8 program to get the sum of
  all numbers present in a list.
  
Author: kartik kukde
DOP: march 2024*/
import java.util.Arrays;
import java.util.List;

public class PracticalNo10 {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum=0;
       for (int n:numbers){
        sum = sum+n;
       }
        System.out.println("Sum of numbers: " + sum);
    }
}

