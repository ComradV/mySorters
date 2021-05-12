package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyMergeSorter<T extends  Comparable<T>> extends MySorter<T>{

    List<T> sortList;
    protected void mySort(){
        sortList = sort(sortList);
        for(int i = 0; i < items.length; i++){
            items[i] = sortList.get(i);
        }
    }

    @Override
    protected String getSortType() {
        return "quick";
    }

    private List<T> sort(List<T> listToSort) {
        if(listToSort.size() == 1){
            return listToSort;
        }
        int leftSize = listToSort.size() / 2;
        List<T> leftPart = listToSort.subList(0, leftSize);
        List<T> rightPart = listToSort.subList(leftSize, listToSort.size());
        leftPart = sort(leftPart);
        rightPart = sort(rightPart);
        return join(leftPart, rightPart);
    }

    private List<T> join(List<T> a, List<T> b){
        List<T> result = new ArrayList<>();
        int pointerA = 0;
        int pointerB = 0;
        boolean exceptedA = false, exceptedB = false;
        boolean fromA;
        while(!exceptedA||!exceptedB){
            fromA = (!exceptedA&&!exceptedB&&(a.get(pointerA).compareTo(b.get(pointerB)) < 0) || exceptedB);
            if(fromA){
                result.add(a.get(pointerA++));
                exceptedA = pointerA == a.size();
            } else {
                result.add(b.get(pointerB++));
                exceptedB = pointerB == b.size();
            }
        }
        return result;
    }

    public MyMergeSorter(T[] items) {
        this.items = items;
        sortList = List.of(items);
    }

}
