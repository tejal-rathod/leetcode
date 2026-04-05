package com.leetcode.soluton.thread;

public class ThreadExample implements  Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        ThreadExample threadExample=new ThreadExample();

        Thread thread=new Thread(threadExample);
        thread.start();

    }
}
