package com.github.xrapalexandra.factory.impl;

public class SortingByMinDesc extends SortingByMin {

    @Override
    public int getValueForSorting(int[] array) {
        int value = -super.getValueForSorting(array);
        return value;
    }
}
