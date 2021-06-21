package com.test;

import java.util.concurrent.TimeUnit;

public class timeTest {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        System.out.println("Time Start");
        TimeUnit.SECONDS.sleep(5);

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("endtime " + timeElapsed);
    }
}
