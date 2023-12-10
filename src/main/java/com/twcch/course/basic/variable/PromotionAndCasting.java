package com.twcch.course.basic.variable;

public class PromotionAndCasting {

    public static void main(String[] args) {

        /*
         * byte => short, char => int => long => float => double
         * boolean
         * promotion: =>, casting: <=
         */
        short a = 10;
        int b = a; // promotion
        byte c = (byte) b; // casting

        System.out.println("c: " + c);

    }

}
