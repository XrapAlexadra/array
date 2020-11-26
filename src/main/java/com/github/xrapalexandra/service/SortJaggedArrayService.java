package com.github.xrapalexandra.service;

import com.github.xrapalexandra.factory.FactorySortingBy;
import com.github.xrapalexandra.factory.SortingBy;
import com.github.xrapalexandra.model.Criterion;

public class SortJaggedArrayService {

    private final FactorySortingBy factorySortingBy = new FactorySortingBy();

    public void sort(int[][] jaggedArray, Criterion criterion) {
        SortingBy sortingBy = factorySortingBy.getSortingBy(criterion);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < jaggedArray.length - 1; i++) {
                int valueLeft = sortingBy.getValueForSorting(jaggedArray[i]);
                int valueRight = sortingBy.getValueForSorting(jaggedArray[i + 1]);
                if (valueLeft > valueRight) {
                    isSorted = false;
                    swap(jaggedArray, i, i + 1);
                }
            }
        }
    }

    private void swap(int[][] jaggedArray, int index1, int index2) {
        int[] temp = jaggedArray[index1];
        jaggedArray[index1] = jaggedArray[index2];
        jaggedArray[index2] = temp;
    }
}
