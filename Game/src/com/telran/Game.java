package com.telran;

public class Game {

    public int startGame(int N, int M) {
        int count = 0;
        while (N > 1) {
            if (N % 2 == 0 && M > 0) {
                N /= 2;
                M--;
                count++;
            } else {
                N -= 1;
                count++;
            }
        }
        return count;
    }
}

