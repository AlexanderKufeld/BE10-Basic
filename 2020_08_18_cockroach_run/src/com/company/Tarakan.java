package com.company;

import java.util.List;

public class Tarakan implements Runnable {

    String name;
    int steps;
    List<Table> table;

    public Tarakan(String name, int steps, List<Table> score) {
        this.name = name;
        this.steps = steps;
        this.table = score;
    }

    @Override
    public void run() {
        int time = 0;
        int max = 100;
        int min = 50;
        for (int i = 0; i < steps; i++) {
            int step = (int) (Math.random() * (max - min + 1) + min);
            time += step;
        }
        table.add(new Table(time, name));
    }
}

