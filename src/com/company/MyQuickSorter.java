package com.company;

import java.util.Random;

public class MyQuickSorter<T extends  Comparable<T>> extends MySorter{

    protected void mySort(){
        quickSort(0, items.length - 1);
    }

    @Override
    protected String getSortType() {
        return "quick";
    }

    private void quickSort(int left, int right) {
        if(right > left) {
            int pivotIndex = getIntInRange(left, right);
            int newPivot = partition(0, items.length - 1, pivotIndex);
            quickSort(left, newPivot - 1);
            quickSort(newPivot + 1, right);
        }
    }

    public int getIntInRange(int left, int right){
        if(left == right){
            return left;
        }
        Random rnd = new Random();
        return left + rnd.nextInt(right-left);
    }

    public MyQuickSorter(T[] items) {
        this.items = items;
    }

    private int partition(int left, int right, int pivotIndex){
        T pivotValue = (T)items[pivotIndex];

        swap(pivotIndex, right);

        int storeIndex = left;
        for(int i = left; i < right; i++){
            if(items[i].compareTo(pivotValue) < 0){
                swap(i, storeIndex);
                storeIndex++;
            }
        }
        swap(storeIndex, right);
        return storeIndex;
    }

}
