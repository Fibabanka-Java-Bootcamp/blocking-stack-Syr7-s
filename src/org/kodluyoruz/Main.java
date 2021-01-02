package org.kodluyoruz;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<Integer> stack=new Stack<>();
        StackExample stackExample=new StackExample(stack);
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=5;i++){
                    stackExample.addItem(i*10);
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=5;i++){
                    stackExample.addItem(i*5);
                }
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=5;i++){
                    stackExample.addItem(i*3);
                }
            }
        });

        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                stackExample.pullItem();
            }
        });
        Thread thread5=new Thread(new Runnable() {
            @Override
            public void run() {
                stackExample.pullItem();
            }
        });
        Thread thread6=new Thread(new Runnable() {
            @Override
            public void run() {
                stackExample.pullItem();
            }
        });
        Thread thread7=new Thread(new Runnable() {
            @Override
            public void run() {
                stackExample.pullItem();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
