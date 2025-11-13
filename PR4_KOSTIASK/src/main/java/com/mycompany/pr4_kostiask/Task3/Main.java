/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pr4_kostiask.Task3;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(1000); // Имитация работы
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 has finished");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(2000); // Имитация работы
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 has finished");
        });
        Thread thread3 = new Thread(() -> {
            System.out.println("Thread 3 is running");
            try {
                Thread.sleep(3000); // Имитация работы
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3 has finished");
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();// Ожидаем завершения thread1
            thread2.join();// Ожидаем завершения thread2
            thread3.join();// Ожидаем завершения thread3
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("from three threads have finished. Main thread resumes.");
        // TODO code application logic here
    }

}
