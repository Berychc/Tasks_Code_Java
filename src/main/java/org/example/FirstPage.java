package org.example;

import java.util.*;

public class FirstPage {

    public static void main(String[] args) {

    }


    private static String deleteDuplicatiesString(String str) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char strToChar : str.toCharArray()) {
            if (seen.add(strToChar)) {
                result.append(strToChar);
            }
        }
        return result.toString();
    }

    private static int[] removeDuplicatiesPrimitiveArray(int[] array) {
        if (array.length == 0) return new int[0];
        Arrays.sort(array);
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[count - 1]) {
                array[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOf(array, count);
    }

    private static int[] removeDuplicatiesPrimitiveArrayDoNotSort(int[] array) {
        Set<Integer> elementsArray = new LinkedHashSet<>(); // Используем LinkedHashSet для сохранения порядка
        for (int num : array) {
            elementsArray.add(num);
        }
        int[] result = new int[elementsArray.size()];
        int index = 0;
        for (Integer num : elementsArray) {
            result[index++] = num;
        }
        return result;
    }

    private static int[] sortedSquaresPrimitiveArray(int[] array) {
        int[] result = new int[array.length];
        int left = 0, right = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            int leftSquares = array[left] * array[left], rightSquares = array[right] * array[right];
            if (rightSquares > leftSquares) {
                result[i] = rightSquares;
                right++;
            }
            else {
                result[i] = leftSquares;
                left++;
            }
        }
        return result;
    }

    private static int reverse(int x) {
        long sum = 0;

        while (x != 0) {
            int rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)sum;
    }
}