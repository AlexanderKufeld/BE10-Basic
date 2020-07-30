package com.telran;

import java.util.List;

public class SortedList {


    public boolean isDevided(List<Integer> list, int N) {
        for (int i = 0; i < list.size(); i++) {
            int temp = N / list.get(i);
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j) == temp) {
                    return true;
                }
            }
        }
        return false;
    }
}

