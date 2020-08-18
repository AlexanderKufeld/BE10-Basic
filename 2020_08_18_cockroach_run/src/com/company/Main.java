package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Table> score = new ArrayList<>();
        Tarakan t1 = new Tarakan("t1", 10, score);
        Tarakan t2 = new Tarakan("t2", 10, score);
        Tarakan t3 = new Tarakan("t3", 10, score);
        Tarakan t4 = new Tarakan("t4", 10, score);
        Tarakan t5 = new Tarakan("t5", 10, score);
        Tarakan t6 = new Tarakan("t6", 10, score);
        Tarakan t7 = new Tarakan("t7", 10, score);
        Tarakan t8 = new Tarakan("t8", 10, score);
        Tarakan t9 = new Tarakan("t9", 10, score);
        Tarakan t10 = new Tarakan("t10", 10, score);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        Thread th4 = new Thread(t4);
        Thread th5 = new Thread(t5);
        Thread th6 = new Thread(t6);
        Thread th7 = new Thread(t7);
        Thread th8 = new Thread(t8);
        Thread th9 = new Thread(t9);
        Thread th10 = new Thread(t10);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();
        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();
        th6.join();
        th7.join();
        th8.join();
        th9.join();
        th10.join();

        score.sort(Comparator.comparingInt(Table::getTable));

        for (int i = 0; i < score.size(); i++) {
            System.out.println("Place: " + (i+1) + ", "
                    + score.get(i));
        }
    }
}
