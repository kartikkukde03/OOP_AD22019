public class PracticalNo4
    {
        public static void main(String[] args)
        {
            String nm = " Kartik Kukde ";
            System.out.println("The input string is:"+nm);
            PrintName(nm);

        }
        public static void PrintName(String name)
        {
            String name1=name.trim();
            
            String[] n1 = name1.split(" ");
             System.out.println("Reformated string:"+n1[1]+" "+n1[0]);


        }
    
    }