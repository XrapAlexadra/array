package com.github.xrapalexandra.service;

import java.util.Comparator;

public class SortJaggedArrayService {

    public void sortByMin(int[][] jaggedArray) {
        Comparator<int[]> comparator = Comparator.comparingInt(this::findMin);
        sort(jaggedArray, comparator);

    }

    public void sortByMinDesc(int[][] jaggedArray) {
        Comparator<int[]> comparator = ((array1, array2) -> findMin(array2) - findMin(array1));
        sort(jaggedArray, comparator);
    }

    public void sortByMax(int[][] jaggedArray) {
        Comparator<int[]> comparator = Comparator.comparingInt(this::findMax);
        sort(jaggedArray, comparator);
    }

    public void sortByMaxDesc(int[][] jaggedArray) {
        Comparator<int[]> comparator = ((array1, array2) -> findMax(array2) - findMax(array1));
        sort(jaggedArray, comparator);
    }

    public void sortBySum(int[][] jaggedArray) {
        Comparator<int[]> comparator = Comparator.comparingInt(this::findSum);
        sort(jaggedArray, comparator);
    }

    public void sortBySumDesc(int[][] jaggedArray) {
        Comparator<int[]> comparator = ((array1, array2) -> findSum(array2) - findSum(array1));
        sort(jaggedArray, comparator);
    }

    private void sort(int[][] jaggedArray, Comparator<int[]> comparator) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < jaggedArray.length - 1; i++) {
                if (comparator.compare(jaggedArray[i], jaggedArray[i + 1]) > 0) {
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

    private int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    private int findMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    private int findSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
