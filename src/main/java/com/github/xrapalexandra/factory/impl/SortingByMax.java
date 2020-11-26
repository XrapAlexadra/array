package com.github.xrapalexandra.factory.impl;

import com.github.xrapalexandra.factory.SortingBy;

public class SortingByMax implements SortingBy {
    @Override
    public int getValueForSorting(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (max < number)
                max = number;
        }
        return max;
    }
}
