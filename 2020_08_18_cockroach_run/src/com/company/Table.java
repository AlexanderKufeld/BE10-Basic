package com.company;

public class Table {

    int score;
    String name;

    public Table(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getTable() {
        return score;
    }

    @Override
    public String toString() {
        return "score=" + score +
                ", name='" + name + '\'';
    }
}

