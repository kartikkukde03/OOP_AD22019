/*Aim:  Raghav is assigned with the task to develop a code for finding out the perimeter and area of a circle given a 
        value of radius. He should use Math.PI constant in his program. If radius is zero or less than zero then print " 
        please enter non zero positive number ". Can you help raghav for developing the code
  Author: Kartik Kukde
  Version:2.0
  Date: 13 feb 2024
*/
import java.util.Scanner;

public class PracticalNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        if (radius <= 0) {
            System.out.println("Please enter a non-zero positive number for the radius.");
        } else {
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter of the circle: " + perimeter);
            System.out.println("Area of the circle: " + area);
        }

        scanner.close();
    }
}