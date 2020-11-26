package com.github.xrapalexandra.factory.impl;

public class SortingByMaxDesc extends SortingByMax {

    @Override
    public int getValueForSorting(int[] array) {
        int value = -super.getValueForSorting(array);
        return value;
    }
}
