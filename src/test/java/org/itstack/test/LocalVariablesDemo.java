package org.itstack.test;

public class LocalVariablesDemo {

    public void test(int age,long l, double d, short s, byte b) {
        System.out.println(age);
        System.out.println(l);
        System.out.println(d);
        System.out.println(s);
        System.out.println(b);
    }

    public static void test1(int age,long l, double d, short s, byte b) {
        System.out.println(age);
        System.out.println(l);
        System.out.println(d);
        System.out.println(s);
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println("a");
    }
}
