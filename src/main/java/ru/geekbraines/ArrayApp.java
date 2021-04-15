package ru.geekbraines;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayApp {

    private static final Logger LOGGER = LogManager.getLogger(ArrayApp.class.getName());

    public int[] method1(int[] array) throws RuntimeException {

        if (!Arrays.stream(array).anyMatch( x -> x == 4)) {
            throw new RuntimeException("массив не содержит четвёрок");
        }

        int n = array.length;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                n = i + 1;
                break;
            }
        }

        return Arrays.stream(array).skip(n).toArray();
    }

    public boolean method2(int[] array) {
        return Arrays.stream(array).allMatch(x -> (x == 4) ^ (x == 1));
    }
}

