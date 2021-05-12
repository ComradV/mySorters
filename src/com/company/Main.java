package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<MySorter<Integer>> sorters = new ArrayList<>();
        sorters.add(new MyQuickSorter<>(getIntegerExample()));
        sorters.add(new MyBubbleSorter<>(getIntegerExample()));
        sorters.add(new MySelectionSorter<>(getIntegerExample()));
        sorters.add(new MyInsertionSorter<>(getIntegerExample()));
        sorters.add(new MyMergeSorter<>(getIntegerExample()));

        for(MySorter<Integer> sorter: sorters){
            sorter.sort();
        }

    }

    private static Integer[] getIntegerExample(){
        return new Integer[]{1,7,2,5,3,17,11,8};
    }
}
