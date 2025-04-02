package org.example;

import java.util.HashSet;

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
}