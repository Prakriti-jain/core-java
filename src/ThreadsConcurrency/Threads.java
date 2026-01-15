package ThreadsConcurrency;

/*
Thread is the smallest unit of execution in a program. There are two ways to create a thread.
- Extending Thread Class
- Implementing Runnable Interface (this is preferred when the class already extends another class)

Life cycle of a thread - A thread goes through the following states
- New - Created but not started
- Runnable - Ready to run
- Running - Currently executing
- Blocked/Waititng - Waiting for resources or signals
- Terminated - Finished execution
*/


//Creating Threads
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is created using extending Thread");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is creating using implementing Runnable");
    }
}


public class Threads {
    static void main() {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }

}
