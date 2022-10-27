package sec02.exam02_threadname;

import java.awt.*;
public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("current thread "+mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("Thread that made threadA "+threadA.currentThread().getName());
        System.out.println("working thread "+threadA.getName());

        ThreadB threadB = new ThreadB();
        System.out.println("working thread " + threadB.getName());
    }
}
