package ThreadsConcurrency;

/*
Executor Framework is high level API for managing threads and running tasks without manually creating
and managing Thread Objects. It has Task Submission(through Runnable/Callable) and Task Execution
(using Thread Pool)

Runnable -
- Represents a task that does not return a result
- cannot throw checked exceptions
- has a single method i.e. void run()

Callable -
- Represents a task that return a result (V - generic result)
- can throw checked exceptions
- has a single method i.e. V call() throws Exception;
- returns Future

Future -
- is an interface that represents the result of an asynchronized computation
- When we submit a Callable task to ExecutorService, it immediately returns Future Object
- acts as a placeholder for the result that will be computed later
 */

import java.util.concurrent.*;

public class ExecutorsEx {
    static void main() throws ExecutionException, InterruptedException {
        //example of executor
        ExecutorService pool = Executors.newFixedThreadPool(4);

        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(300);
                return "Prakriti";
            }
        };

        Future<String> result = pool.submit(task);
        System.out.println("Result is " + result.get());

        pool.shutdown();



        //scheduling threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        //scheduling at a fixed rate - periodic task - every 10 seconds
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Task is being executed every 10 seconds");
        }, 1, 10, TimeUnit.SECONDS);

        //scheduling with a delay of 10 seconds
        scheduler.schedule(() -> {
            System.out.println("Task is being scheduled with a delay of 10 seconds");
        }, 10, TimeUnit.SECONDS);
    }
}
