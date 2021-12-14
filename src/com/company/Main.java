package com.company;

public class Main extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());

    }


    public static void main(String[] args) {
        Main p1=new Main();
        Main p2=new Main();
        p1.start();
        p2.start();
	// write your code here
    }
}
