package com.company;

public abstract class MySorter<T extends  Comparable<T>> {
    protected T[] items;

    public void sort() {
        printArr("Before "+getSortType()+" sort");
        mySort();
        printArr("After "+getSortType()+" sort");
    }

    protected abstract void mySort();

    protected abstract String getSortType();

    public void printArr(String message){
        StringBuilder sb = new StringBuilder(message.length()==0?"":message+": ");
        for(T elem:items){
            sb.append(elem);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

    protected void swap(int left, int right){
        if(left != right){
            T temp = items[left];
            items[left] = items[right];
            items[right] = temp;
        }
    }


}
