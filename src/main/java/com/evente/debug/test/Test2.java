package com.evente.debug.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("start...");

        operateList();

        System.out.println("end...");
    }

    private static void operateList(){

        /**
         * ArrayList 的初始化：
         * 1. modCount = 0
         * 2. 数组初始化 this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA = = {};
         */


        List<String> list = new ArrayList<>();
        list.add("贾玲");
        list.add("贾冰");
        list.add("贾岛");
        list.add("贾宝玉");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if ("贾冰".equals(name)){
                // add element to list
                list.add("假货");
            }
        }
    }

}
