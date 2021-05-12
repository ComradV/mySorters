package com.company;

public class MyBubbleSorter<T extends  Comparable<T>> extends MySorter{

    @Override
    protected void mySort() {
        for(int i = 0; i < items.length - 1; i++)
            for(int j = i; j < items.length - 1; j++){
                if(items[j].compareTo(items[j+1]) > 0){
                    swap(j, j+1);
                }
            }
    }

    @Override
    protected String getSortType() {
        return "bubble";
    }

    public MyBubbleSorter(T[] items) {
        this.items = items;
    }
}
