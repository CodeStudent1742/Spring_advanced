package com.kodilla.beanlifecycle.student;

import java.util.Random;

public class Student {
    private String indexNumber;

    public Student(int indexNumberLength) {
        this.indexNumber = generateRandomString(indexNumberLength);
    }

    private String generateRandomString(int length) {
        int leftLimit = 48; // '0'
        int rightLimit = 122; // 'z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit )
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
