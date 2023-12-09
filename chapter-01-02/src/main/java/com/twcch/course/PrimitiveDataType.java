package com.twcch.course;

public class PrimitiveDataType {

    public static void main(String[] args) {

        /*
         * byte => short, char => int => long => float => double
         * boolean
         */
        byte a = 127;
        short b = 10000;
        char c = 100;
        int d = 1234;
        long e = 1000L;
        float f = 3.14f;
        double g = 3.14;
        boolean h = true;

        System.out.printf("a = %5d, b = %5d, c = %5c, d = %5d, e = %5d, " +
                "f = %5f, g = %5f, h = %b", a, b, c, d, e, f, g, h);

    }

}
