package com.kodilla.events.test;

public class ClassLoadersTest {

    public static void main(String[] args) {
        System.out.println(ClassLoadersTest.class.getClassLoader());
        System.out.println(Throwable.class.getClassLoader());
    }

}
