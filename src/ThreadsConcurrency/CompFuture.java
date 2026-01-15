package ThreadsConcurrency;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

/*
CompletableFuture is an extension to Future, it provides more methods to handle asynchronous
programming (Asynchronous programming means tasks run independently without blocking the main
thread) with nonblocking and chaining operations. Unlike Future blocks get until it's done,
CompletableFuture is nonblocking with callbacks
 */

public class CompFuture {
    static void main() {
        CompletableFuture<String> cf = new CompletableFuture<>();
        CompletableFuture.runAsync(() -> {
            String str1 = "Prakriti";
            String str2 = "Jain";
            String str3 = Arrays.toString(str1.split("k"));
            cf.complete(str3 + str2);
//            return str3 + str2;
        });

        //requires complete statement if task is defined separately otherwise return for
        // supplyAsync which is defined inside the constructor of CompletableFuture

        String result = cf.join();
        System.out.println("Result is " + result);
    }
}
