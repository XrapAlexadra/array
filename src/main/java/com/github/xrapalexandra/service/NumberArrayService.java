package com.github.xrapalexandra.service;

import com.github.xrapalexandra.model.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class NumberArrayService {

    private static final Logger logger = LogManager.getLogger(NumberArrayService.class);

    private static final int UPPER_BOUND_THREE_DIGIT_NUMBER = 1000;
    private static final int LOWER_BOUND_THREE_DIGIT_NUMBER = 99;

    public int findMax(NumberArray numberArray) {
        int max = numberArray.get(0);

        for (int i = 1; i < numberArray.length(); i++) {
            if (max < numberArray.get(i)) {
                max = numberArray.get(i);
            }
        }
        logger.info("The max Number of the numberArray is " + max);
        return max;
    }

    public int findMin(NumberArray numberArray) {
        int min = numberArray.get(0);

        for (int i = 1; i < numberArray.length(); i++) {
            if (min > numberArray.get(i)) {
                min = numberArray.get(i);
            }
        }
        logger.info("The min Number of the numberArray is " + min);
        return min;
    }

    public int getIndexOf(NumberArray numberArray, int number) {

        int firstIndex = 0;
        int lastIndex = numberArray.length() - 1;
        int index = -1;

        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            int currentNumber = numberArray.get(midIndex);
            if (number == currentNumber) {
                index = midIndex;
                break;
            }
            if (number > currentNumber) {
                firstIndex = midIndex + 1;
            }
            if (number < currentNumber) {
                lastIndex = midIndex - 1;
            }
        }
        logger.info("The index of number: " + number + " is " + index);
        return index;
    }

    public List<Integer> findAllPrime(NumberArray numberArray) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 0; i < numberArray.length(); i++) {
            int currentNumber = numberArray.get(i);
            if (isPrime(currentNumber)) {
                primeNumbers.add(currentNumber);
            }
        }
        logger.info("All prime numbers in the numberArray is " + primeNumbers);
        return primeNumbers;
    }

    public List<Integer> findAllFibonacci(NumberArray numberArray) {
        List<Integer> fibonacciInArray = new ArrayList<>();

        for (int i = 0; i < numberArray.length(); i++) {
            int currentNumber = numberArray.get(i);
            if (isFibonacci(currentNumber)) {
                fibonacciInArray.add(currentNumber);
            }
        }
        logger.info("All fibonacci numbers in the numberArray is " + fibonacciInArray);
        return fibonacciInArray;
    }

    private boolean isFibonacci(int number) {
        boolean isFibonacci = false;
        double calculation1 = Math.sqrt(5 * (number * number) - 4);
        double calculation2 = Math.sqrt(5 * (number * number) + 4);

        if (calculation1 % 1 == 0 || calculation2 % 1 == 0) {
            isFibonacci = true;
        }
        return isFibonacci;
    }

    public List<Integer> findAllWithThreeNoRepeatDigit(NumberArray numberArray) {
        List<Integer> rightNumbers = new ArrayList<>();

        for (int i = 0; i < numberArray.length(); i++) {
            int currentNumber = numberArray.get(i);

            if (currentNumber > LOWER_BOUND_THREE_DIGIT_NUMBER && currentNumber < UPPER_BOUND_THREE_DIGIT_NUMBER) {
                int units = currentNumber % 10;
                int dozens = (currentNumber / 10) % 10;
                int hundreds = (currentNumber / 100) % 10;
                if (units != dozens && dozens != hundreds && hundreds != units) {
                    rightNumbers.add(currentNumber);
                }
            }
        }
        logger.info("All three-digit numbers with no repeat from numberArray is " + rightNumbers);
        return rightNumbers;
    }

    private boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 0 || number == 1) {
            isPrime = false;
        }
        for (int i = 2; i < number / i; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
