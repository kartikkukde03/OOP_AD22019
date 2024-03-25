/*Aim: a. Create a class Solution. It will be given two  integers x and y as input, you have to compute x/y. If x 
and y are not 32 bit signed integers or if y is zero, an  exception will occur and you have to report it.
b. Create a method named validate() that accepts  an integer as a parameter. If the age is less than 18, we  are throwing the Arithmetic Exception otherwise print 
a message welcome to vote
Author: kartik kukde
DOP:19 march 2024
*/
class PracticalNo7{
    public static void main(String[] args) {
        try {
            Solution solution = new Solution();
            System.out.println("The result of division is : "+solution.divide(10, 5));  // Output: 2
            //System.out.println(solution.divide(10, 0));  // Exception: Division by zero
            //System.out.println(solution.divide(21, 1));  // Output: 2147483647
            System.out.println("The result of division is : "+solution.divide(2147483648, 2));  // Exception: Result out of range for 32-bit signed integer
            solution.validate(20);  // Output: Welcome to vote code in java
            solution.validate(15);  // Exception: Age is less than 18
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

}
class Solution {

    
    public int divide(int x, int y) throws Exception {
        try {
            if (y == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return (int)x/y;
        } catch (ArithmeticException e) {
            throw e;
        } catch (Exception e) {
            throw new Exception("Exception occurred: Inputs are not 32-bit signed integers");
        }
    }

    public void validate(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Welcome to vote ");
        }
    }
}