/**Aim:Execution of two or more threads occurs in a random order. The keyword ‘synchronized’
in Java is used to control the execution of thread in a strict sequence. In the following, the
program is expected to print some numbers. Do the necessary use of ‘synchronized’
keyword, so that, the program prints the output in the following order:
-----------------OUTPUT-------------------
5 10 15 20 25 30 35 40 45 50
------------------------------------------.

Author: kartik kukde
DOP: march 2024*/
class Counter1 {
    private int count = 0;

    // synchronized method to increment count
    public synchronized void increment() {
        count += 5;
        System.out.print(count + " ");
    }
}

class MyThread extends Thread {
    Counter1 counter;

    public MyThread(Counter1 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class PracticalNo9 {
    public static void main(String[] args) {
        Counter1 counter = new Counter1();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();
    }
}


