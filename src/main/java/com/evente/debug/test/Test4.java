package com.evente.debug.test;

public class Test4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            execute(i);
        }
    }

    private static void execute(int num){
        int rs = ((num + 3) *5 + 9) / num;

        System.out.println("num = " + num);
        System.out.println("rs = " + rs);
    }
}
