package com.github.xrapalexandra.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberArray {

    private List<Integer> array;

    public NumberArray() {
        array = new ArrayList<>();
    }

    public NumberArray(List<Integer> array) {
        this.array = array;
    }

    public NumberArray(Integer... array) {
        List<Integer> list = Arrays.asList(array);
        this.array = new ArrayList<>(list);
    }

    public int size() {
        return array.size();
    }

    public void add(int number) {
        array.add(number);
    }

    public int get(int index) {
        return array.get(index);
    }

    public void set(int index, int number) {
        array.set(index, number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberArray that = (NumberArray) o;
        if(this.size() != that.size()){
            return false;
        }
        for (int i =0; i < size(); i++){
            if(this.get(i) != that.get(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        for (Integer number : array) {
            result = prime * result + number;
        }
        return result;
    }

    @Override
    public String toString() {
        return "NumberArray{" +
                "array=" + array +
                '}';
    }
}
