package com.company;

public class MySelectionSorter<T extends  Comparable<T>> extends MySorter<T>{

    protected void mySort(){
        T minValue;
        int minIndex;
        for(int i = 0; i < items.length - 1; i++) {
            minValue = items[i];
            minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (minValue.compareTo(items[j]) > 0) {
                    minIndex = j;
                    minValue = items[j];
                }
            }
            swap(i, minIndex);
//            printArr(Integer.toString(i));
        }
    }

    @Override
    protected String getSortType() {
        return "selection";
    }

    public MySelectionSorter(T[] items) {
        this.items = items;
    }

}
