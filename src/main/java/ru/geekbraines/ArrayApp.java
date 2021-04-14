package ru.geekbraines;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        ArrayApp a1 = new ArrayApp();
        int[] arr1 = {1,2,4,0,3,7};
        try {
            int[] arr2 = a1.method1(arr1);
            Arrays.stream(arr2).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[] method1(int[] array) throws RuntimeException {
        boolean noExcept = false;

        int [] arrExcept = Arrays.stream(array).filter( x -> x == 4).toArray();
        if (arrExcept.length == 0) {
            throw new RuntimeException("массив не содержит четвёрок");
        }

        int n = array.length;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                n = i + 1;
                break;
            }
        }
        int[] newArray = Arrays.stream(array).skip(n).toArray();

        return newArray;
    }
}
