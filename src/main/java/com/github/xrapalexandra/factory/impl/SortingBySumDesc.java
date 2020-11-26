package com.github.xrapalexandra.factory.impl;

public class SortingBySumDesc extends SortingBySum {

    @Override
    public int getValueForSorting(int[] array) {
        int value = -super.getValueForSorting(array);
        return value;
    }
}
