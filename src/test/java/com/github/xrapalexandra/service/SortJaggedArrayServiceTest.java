package com.github.xrapalexandra.service;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortJaggedArrayServiceTest extends Assert {


    SortJaggedArrayService sortJaggedArrayService = new SortJaggedArrayService();
    int[][] jaggedArray;

    @BeforeMethod
    public void setUp() {
        jaggedArray = new int[][]{{3, 5, 6, 7}, {0, 6, 2}, {5, 4, 2}};
    }

    @Test
    public void testSortByMin() {
        sortJaggedArrayService.sortByMin(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{0, 6, 2}, {5, 4, 2}, {3, 5, 6, 7}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMinDesc() {
        sortJaggedArrayService.sortByMinDesc(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{3, 5, 6, 7}, {5, 4, 2}, {0, 6, 2}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMax() {
        sortJaggedArrayService.sortByMax(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{5, 4, 2}, {0, 6, 2}, {3, 5, 6, 7}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMaxDesc() {
        sortJaggedArrayService.sortByMaxDesc(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{3, 5, 6, 7}, {0, 6, 2}, {5, 4, 2}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortBySum() {
        sortJaggedArrayService.sortBySum(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{0, 6, 2}, {5, 4, 2}, {3, 5, 6, 7}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortBySumDesc() {
        sortJaggedArrayService.sortBySumDesc(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{3, 5, 6, 7}, {5, 4, 2}, {0, 6, 2}};

        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        jaggedArray = null;
    }
}