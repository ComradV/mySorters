package com.company;

public class MyInsertionSorter<T extends  Comparable<T>> extends MySorter<T>{

    protected void mySort(){
        T valueToInsert;
        int insertionIndex;
        for(int i = 1; i < items.length; i++) {
            if (items[i].compareTo(items[i-1]) < 0){
                valueToInsert = items[i];
                insertionIndex = findIndex(valueToInsert, i);
                insertValue(i, insertionIndex);
            }
        }
    }

    private void insertValue(int from, int to) {
        T temp = items[from];
        if (from - to >= 0) System.arraycopy(items, to, items, to + 1, from - to);
        items[to] = temp;
    }

    private int findIndex(T valueToInsert, int sortedLength) {
        for(int i = 0; i < sortedLength; i++){
            if(items[i].compareTo(valueToInsert) > 0){
                return i;
            }
        }
        return -1;
    }

    @Override
    protected String getSortType() {
        return "insertion";
    }

    public MyInsertionSorter(T[] items) {
        this.items = items;
    }

}
