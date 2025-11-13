/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pr4_kostiask.Task1;

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
            System.out.println("Поток 1 начал выполнение.");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Поток 2 начал выполнение.");
        });
        Thread thread3 = new Thread(() -> {
            System.out.println("Поток 3 начал выполнение.");
        });
        thread1.start();
        thread2.start();
        thread3.start();
        // TODO code application logic here
    }

}
