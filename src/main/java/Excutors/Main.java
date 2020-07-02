package Excutors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 50, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1000), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        executor.submit(()->{
            System.out.println("hello");
        });
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
