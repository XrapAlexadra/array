package com.github.xrapalexandra.service;

import com.github.xrapalexandra.model.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortNumberArrayService {

    private static final Logger logger = LogManager.getLogger(SortNumberArrayService.class);

    public void bubbleSort(NumberArray numberArray) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numberArray.length() - 1; i++) {
                if (numberArray.get(i) > numberArray.get(i + 1)) {
                    isSorted = false;
                    swap(numberArray, i, i + 1);
                }
            }
        }
        logger.info("Sort numberArray with BubbleSort: " + numberArray);
    }

    public void insertionSort(NumberArray numberArray) {
        for (int i = 1; i < numberArray.length(); i++) {
            int current = numberArray.get(i);
            int j = i - 1;
            while (j >= 0 && current < numberArray.get(j)) {
                int shiftedNumber = numberArray.get(j);
                numberArray.set(j + 1, shiftedNumber);
                j--;
            }
            numberArray.set(j + 1, current);
        }
        logger.info("Sort numberArray with InsertionSort " + numberArray);
    }

    public void selectionSort(NumberArray numberArray) {
        for (int i = 0; i < numberArray.length(); i++) {
            int minNumber = numberArray.get(i);
            int minIndex = i;
            for (int j = i + 1; j < numberArray.length(); j++) {
                if (numberArray.get(j) < minNumber) {
                    minIndex = j;
                    minNumber = numberArray.get(j);
                }
            }
            swap(numberArray, i, minIndex);
        }
        logger.info("Sort numberArray with SelectionSort " + numberArray);
    }

    private void swap(NumberArray numberArray, int index1, int index2) {
        int temp = numberArray.get(index1);
        numberArray.set(index1, numberArray.get(index2));
        numberArray.set(index2, temp);
    }
}
