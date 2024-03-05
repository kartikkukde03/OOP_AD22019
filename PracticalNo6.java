/*Aim: Construct the code using given statement Create a class First in learnjava 
package that access it in another class Second by using import keyword.
Author: kartik kukde
DOP:5 march 2024
*/
import learnjava.*;
import kartik.*;

class PracticalNo6{
    public static void main(String[] args)
    {
         System.out.println("\nusing package learnjava");
        First obj1 = new First();
        obj1.display();

        System.out.println("\nusing package kartik");

        kk obj2 = new kk();
        obj2.display();
    }

}