package ThreadsConcurrency;

/*
When multiple threads access the same mutable data concurrently, we can get race conditions and
data corruptions. If two threads does operations concurrently, their read/writes can interleave
and one update can be lost, that's why we must coordinate access to shared state - i.e. synchronize

Using synchronized in java -
- only one thread at a time can access the shared resource to perform operations
- the other threads have to wait until the resource is free
*/


class Counter {
    private int count = 0;

    //synchronized method - because this will be used by two threads
    public synchronized void increment() {
        count++;
    }

    public int getCount(){
        return count;
    }
}
public class Synchronised {
    static void main() throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0 ; i<100000 ; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0 ; i<100000 ; i++) {
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count : " + counter.getCount());
    }
}
