package com.github.xrapalexandra.service;

import com.github.xrapalexandra.model.NumberArray;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class NumberArrayServiceTest extends Assert {

    NumberArrayService numberArrayService = new NumberArrayService();
    NumberArray numberArray;
    NumberArray sortNumberArray;

    @BeforeMethod
    public void setUp() {
        numberArray = new NumberArray(0, 21, 144, 987, 1597, 17, 113, 163, 199);
        sortNumberArray = new NumberArray(0, 24, 56, 101, 256, 1024, 2056);
    }

    @Test
    public void testFindMax() {
        int actual = numberArrayService.findMax(numberArray);
        int expected = 1597;

        assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        int actual = numberArrayService.findMin(numberArray);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testGetIndexOfExist() {
        int actual = numberArrayService.getIndexOf(sortNumberArray, 101);
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    public void testGetIndexOfNotExist() {
        int actual = numberArrayService.getIndexOf(sortNumberArray, 57);
        int expected = -1;

        assertEquals(actual, expected);
    }

    @Test
    public void testFindAllPrime() {
        List<Integer> actual = numberArrayService.findAllPrime(numberArray);
        List<Integer> expected = Arrays.asList(1597, 17, 113, 163, 199);
        System.out.println(actual);

        assertEquals(actual, expected);
    }

    @Test
    public void testFindAllFibonacci() {
        List<Integer> actual = numberArrayService.findAllFibonacci(numberArray);
        List<Integer> expected = Arrays.asList(0, 21, 144, 987, 1597);

        assertEquals(actual, expected);
    }

    @Test
    public void testFindAllWithThreeNoRepeatDigit() {
        List<Integer> actual = numberArrayService.findAllWithThreeNoRepeatDigit(numberArray);
        List<Integer> expected = Arrays.asList(987, 163);

        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        numberArray = null;
        sortNumberArray = null;
    }
}