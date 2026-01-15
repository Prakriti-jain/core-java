package ThreadsConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Thread pool is a mechanism to manage a group of reusable threads for executing a set of tasks
efficiently. So instead of creating a new thread for every task, a thread pool keeps a set of threads
ready to run tasks. So whenever a new task is submitted, thread pool assigns it to an available thread.
 */
public class Threadpool {
    static void main() {
        //Creating a thread pool
        ExecutorService pool = Executors.newFixedThreadPool(4);

        for(int i=1 ; i<=10 ; i++) {
            int taskID = i;

            //submit a task
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task " + taskID + " is executed by " + Thread.currentThread().getName());
                }
            });
        }

        pool.shutdown();
    }
}
