package com.github.xrapalexandra.creator;

import com.github.xrapalexandra.model.NumberArray;

import java.util.Random;

public class RandomNumberArrayCreator {

    private Random random = new Random();
    private static final int DEFAULT_AMOUNT = 20;
    private static final int DEFAULT_MAX = 1000;

    public NumberArray create(){
        NumberArray numberArray = create(DEFAULT_MAX, DEFAULT_AMOUNT);
        return numberArray;
    }

    public NumberArray create(int max) {
        NumberArray numberArray = create(max, DEFAULT_AMOUNT);
        return numberArray;
    }

    public NumberArray create(int max, int amount){
        NumberArray numberArray = new NumberArray(amount);
        for (int i = 0; i <amount; i++){
            numberArray.set(i, random.nextInt(max));
        }
        return numberArray;
    }

}
