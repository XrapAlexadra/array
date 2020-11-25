package com.github.xrapalexandra.service;

import com.github.xrapalexandra.model.NumberArray;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SortNumberArrayServiceTest extends Assert {

    SortNumberArrayService sortNumberArrayService = new SortNumberArrayService();

    @DataProvider
    public Object[][] sortNumberArrayServiceData() {
        return new Object[][]{
                {new NumberArray(3, 125, 542, 0, 879, 35, 97), new NumberArray(0, 3, 35, 97, 125, 542, 879)},
                {new NumberArray(3, 5, 0, 0, 0, 15, 87), new NumberArray(0, 0, 0, 3, 5, 15, 87)},
                {new NumberArray(1, 125, 125, 3, 4, 54, 97), new NumberArray(1, 3, 4, 54, 97, 125, 125)},
                {new NumberArray(7, 6, 5, 4, 3, 2, 1), new NumberArray(1, 2, 3, 4, 5, 6, 7)},
                {new NumberArray(12, 13, 14, 12, 13, 15, 16), new NumberArray(12, 12, 13, 13, 14, 15, 16)}
        };
    }

    @Test(dataProvider = "sortNumberArrayServiceData")
    public void testBubbleSort(NumberArray numberArray, NumberArray expected) {
    NumberArray actual = numberArray;
    sortNumberArrayService.bubbleSort(numberArray);

    assertEquals(actual, expected);
    }

    @Test(dataProvider = "sortNumberArrayServiceData")
    public void testInsertionSort(NumberArray numberArray, NumberArray expected) {
        NumberArray actual = numberArray;
        sortNumberArrayService.insertionSort(numberArray);

        assertEquals(actual, expected);
    }

    @Test(dataProvider = "sortNumberArrayServiceData")
    public void testSelectionSort(NumberArray numberArray, NumberArray expected) {
        NumberArray actual = numberArray;
        sortNumberArrayService.selectionSort(numberArray);

        assertEquals(actual, expected);
    }
}