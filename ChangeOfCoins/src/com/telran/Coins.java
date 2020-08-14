package com.telran;

public class Coins {
    public int makeChange(int change) {
        if (change == 0)
            return 0;
        if (change == 1 || change == 5 || change == 10)
            return 1;

        if (change >= 10) {
            return makeChange(change - 10)+1;
        } else if (change >= 5 && change < 10) {
            return makeChange(change - 5)+1;
        } else {
            return makeChange(change - 1)+1;
        }
    }
}

