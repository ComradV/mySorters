package com.company;

public class Main{

    public static void main(String[] args) {
        MyQuickSorter<Integer> quickSorter = new MyQuickSorter<>(getIntegerExample());
        quickSorter.sort();

        MyBubbleSorter<Integer> bubbleSorter = new MyBubbleSorter<>(getIntegerExample());
        bubbleSorter.sort();
    }

    private static Integer[] getIntegerExample(){
        return new Integer[]{1,7,2,5,3,17,11,8};
    }
}
