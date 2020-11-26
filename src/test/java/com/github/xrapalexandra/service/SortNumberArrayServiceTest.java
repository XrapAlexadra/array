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
                {new NumberArray(new int[]{3, 125, 542, 0, 879, 35, 97}), new NumberArray(new int[]{0, 3, 35, 97, 125, 542, 879})},
                {new NumberArray(new int[]{3, 5, 0, 0, 0, 15, 87}), new NumberArray(new int[]{0, 0, 0, 3, 5, 15, 87})},
                {new NumberArray(new int[]{1, 125, 125, 3, 4, 54, 97}), new NumberArray(new int[]{1, 3, 4, 54, 97, 125, 125})},
                {new NumberArray(new int[]{7, 6, 5, 4, 3, 2, 1}), new NumberArray(new int[]{1, 2, 3, 4, 5, 6, 7})},
                {new NumberArray(new int[]{12, 13, 14, 12, 13, 15, 16}), new NumberArray(new int[]{12, 12, 13, 13, 14, 15, 16})}
        };
    }

    @Test(dataProvider = "sortNumberArrayServiceData")
    public void testBubbleSort(NumberArray numberArray, NumberArray expected) {
        sortNumberArrayService.bubbleSort(numberArray);
        NumberArray actual = numberArray;
        
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "sortNumberArrayServiceData")
    public void testInsertionSort(NumberArray numberArray, NumberArray expected) {
        sortNumberArrayService.insertionSort(numberArray);
        NumberArray actual = numberArray;

        assertEquals(actual, expected);
    }

    @Test(dataProvider = "sortNumberArrayServiceData")
    public void testSelectionSort(NumberArray numberArray, NumberArray expected) {
        sortNumberArrayService.selectionSort(numberArray);
        NumberArray actual = numberArray;

        assertEquals(actual, expected);
    }
}