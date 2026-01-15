package ThreadsConcurrency;

import static java.lang.Thread.sleep;

public class Deadlock {
    static void main() {
        String lock1 = "LOCK1";
        String lock2 = "LOCK2";

        Thread t1 = new Thread(() -> {
            System.out.println("T1 tyring to lock LOCK1");
            synchronized (lock1) {
                System.out.println("T1 locked LOCK1");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T1 trying to lock LOCK2");
                synchronized (lock2) {
                    System.out.println("T1 locked LOCK2");
                    System.out.println("T1 has both LOCK1 and LOCK2");
                }

                System.out.println("T1 released LOCK2");
            }

            System.out.println("T1 released LOCK1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("T2 tyring to lock LOCK2");
            synchronized (lock2) {
                System.out.println("T2 locked LOCK2");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T2 trying to lock LOCK1");
                synchronized (lock1) {
                    System.out.println("T2 locked LOCK1");
                    System.out.println("T2 has both LOCK1 and LOCK2");
                }
                System.out.println("T2 released LOCK1");
            }
            System.out.println("T2 released LOCK2");
        });

        t1.start();
        t2.start();


    }
}
