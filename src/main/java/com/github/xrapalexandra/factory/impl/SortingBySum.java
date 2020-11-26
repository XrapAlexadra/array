package com.github.xrapalexandra.factory.impl;

import com.github.xrapalexandra.factory.SortingBy;

public class SortingBySum implements SortingBy {
    @Override
    public int getValueForSorting(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
