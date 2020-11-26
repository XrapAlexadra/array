package com.github.xrapalexandra.model;

public class NumberArray {

    private int[] array;

    public NumberArray(int length) {
        array = new int[length];
    }

    public NumberArray(int[] array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int number) {
        array[index] = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberArray that = (NumberArray) o;
        if (this.length() != that.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (this.get(i) != that.get(i)) {
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NumberArray{ array= ");
        for (int number : array) {
            stringBuilder.append(number);
            stringBuilder.append(" ");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
