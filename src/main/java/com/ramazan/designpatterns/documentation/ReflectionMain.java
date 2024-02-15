package com.ramazan.designpatterns.documentation;

import java.lang.reflect.Constructor;

public class ReflectionMain {
    public static void main(String[] args) {
        try {
            Class<?> stringClass = String.class;

            // No-arg constructor
            Constructor<?> constructor = stringClass.getDeclaredConstructor();
            String stringInstance = (String) constructor.newInstance();

            System.out.println("Created instance: " + stringInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
