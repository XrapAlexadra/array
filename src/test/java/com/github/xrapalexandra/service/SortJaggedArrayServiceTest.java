package com.github.xrapalexandra.service;

import com.github.xrapalexandra.model.Criterion;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SortJaggedArrayServiceTest extends Assert {

    SortJaggedArrayService sortJaggedArrayService = new SortJaggedArrayService();
    int[][] jaggedArray;

    @BeforeMethod
    public void setUp() {
        int[][] temp = {{1, 2, 5, 6}, {2, 0}, {3, 4, 8}, {1, 0, 3, 11}};
        jaggedArray = temp;
    }

    @Test
    public void testSortByMin() {
        sortJaggedArrayService.sort(jaggedArray, Criterion.MIN);
        int[][] actual = jaggedArray;
        int[][] expected = {{2, 0}, {1, 0, 3, 11}, {1, 2, 5, 6}, {3, 4, 8}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMinDesc() {
        sortJaggedArrayService.sort(jaggedArray, Criterion.MIN_DESC);
        int[][] actual = jaggedArray;
        int[][] expected = {{3, 4, 8}, {1, 2, 5, 6}, {2, 0}, {1, 0, 3, 11}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMax() {
        sortJaggedArrayService.sort(jaggedArray, Criterion.MAX);
        int[][] actual = jaggedArray;
        int[][] expected = {{2, 0}, {1, 2, 5, 6}, {3, 4, 8}, {1, 0, 3, 11}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMaxDesc() {
        sortJaggedArrayService.sort(jaggedArray, Criterion.MAX_DESC);
        int[][] actual = jaggedArray;
        int[][] expected = {{1, 0, 3, 11}, {3, 4, 8}, {1, 2, 5, 6}, {2, 0}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortBySum() {
        sortJaggedArrayService.sort(jaggedArray, Criterion.SUM);
        int[][] actual = jaggedArray;
        int[][] expected = {{2, 0}, {1, 2, 5, 6}, {3, 4, 8}, {1, 0, 3, 11}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortBySumDesc() {
        sortJaggedArrayService.sort(jaggedArray, Criterion.SUM_DESC);
        int[][] actual = jaggedArray;
        int[][] expected = {{3, 4, 8}, {1, 0, 3, 11}, {1, 2, 5, 6}, {2, 0}};

        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        jaggedArray = null;
    }
}