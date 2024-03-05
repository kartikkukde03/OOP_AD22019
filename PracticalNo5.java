class Emerging_Technologies
 {
    String president = "Himanshi Kawade";
    String vice_president = "Himanshu Shrivastav";
    String treasurer = "Yash Virulkar";
    String secretary = "Harsh Dhimole";
    String joint_scretary = "Mayank Hirekhan";
    
    void display()


    
    {
        System.out.println("This is Super Class");
        System.out.println("Forum info of Emerging Technology: \n");
        System.out.println("President :-"+president);
        System.out.println("vice president:-"+vice_president);
        System.out.println("Treasurer:-"+treasurer);
        System.out.println("Secretary:-"+secretary);
        System.out.println("Join Secretary"+joint_scretary);

    }

 }

class AIML extends Emerging_Technologies
  {
    String president = "Kartik kukde";
   

    void aiml_display()
    { 
        System.out.println("This is child class of Emerging Technology");
        System.out.println("Forum info of AIML: \n");
        System.out.println("President :-"+president);
        System.out.println("vice president:-"+vice_president);
        System.out.println("Treasurer:-"+treasurer);
        System.out.println("Secretary:-"+secretary);
        System.out.println("Join Secretary"+joint_scretary);

    }


}


  class AIDS extends Emerging_Technologies
  {
    String president = "Kartik kukde AIDS";
   

    void aids_display()
    {
        System.out.println("This is child class of Emerging Technology \n");
        System.out.println("Forum info of AIDS: \n");
        System.out.println("President :-"+president);
        System.out.println("vice president:-"+vice_president);
        System.out.println("Treasurer:-"+treasurer);
        System.out.println("Secretary:-"+secretary);
        System.out.println("Join Secretary"+joint_scretary);

    }


  }

public class PracticalNo5
    {
        public static void main(String[] args)
        {
            Emerging_Technologies s1 = new Emerging_Technologies();
            //Super class
            s1.display();
            System.out.println("-------------------------------------");

            AIDS s2 = new AIDS();
            System.out.println("calling the method of super class \n");
            System.out.println(" ");
            //calling the method of super class
            s2.display();
            System.out.println("\n*************************************");
            System.out.println("calling overridden method \n");
            //calling overridden method
            s2.aids_display();
            System.out.println("-------------------------------------");

            AIML s3 = new AIML();
            System.out.println("calling the method of super class \n");
            //calling the method of super class
            s3.display();
            System.out.println("\n*************************************");
            System.out.println("calling overridden method \n");
            //calling overridden method
            s3.aiml_display();
            System.out.println("-------------------------------------");



        }
    }
