public class PracticalNo8 {
 
    public static void main(String[] args){
        Mythread T1 = new Mythread(1);
        // Mythread T2 = new Mythread(2);
          //Mythread T3 = new Mythread(3);
           //Mythread T4 = new Mythread(4);
            //Mythread T5 = new Mythread(5);
           
          System.out.println("state is"+ T1.getState());
            T1.start();
             System.out.println("state is"+ T1.getState());
             T1.suspend();
             System.out.println("state is"+ T1.getState());
             T1.resume();
       System.out.println("state is"+ T1.getState());

    }
}
class Mythread extends Thread{
    int Tcount;
    public Mythread (int Tcount){
    this.Tcount = Tcount;
    }
 
 
     public void run()
     {
         System.out.println("thread count: "+ Tcount);
     
     }
}