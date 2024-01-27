package com.company;

public class operators {
    public static void main(String[] args) {
//         1. Arithmetic operator
        int a =4;
        int c =6 + a; //modulo operator
        System.out.println(c);
//        2. Assignment operator
        int b =6;
        b *=3;
        System.out.println(b);

//        3. comparison operator
        System.out.println(45>4);
        System.out.println(45<9);

//        4. Logical operators
        System.out.println(99>4 && 8<2);
        System.out.println(64>3 || 64<2);

//        5. Bitwise operator
        System.out.println(2&3);

        float val = 7/4 * 9/2;
        System.out.println(val);
        float val1 = 7/4.0f * 9/2.0f;
        System.out.println(val1);
    }
}
