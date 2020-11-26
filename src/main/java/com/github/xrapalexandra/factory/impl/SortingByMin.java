package com.github.xrapalexandra.factory.impl;

import com.github.xrapalexandra.factory.SortingBy;

public class SortingByMin implements SortingBy {

    @Override
    public int getValueForSorting(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (min > number)
                min = number;
        }
        return min;
    }
}
