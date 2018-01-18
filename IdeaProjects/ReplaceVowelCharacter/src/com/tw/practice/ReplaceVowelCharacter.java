package com.tw.practice;

public class ReplaceVowelCharacter {
    private String vowels = "aeiouAEIOU";
    private final double LIMIT_PERCENT = 0.30;

    public String replace(String str) {

        double percent = getPercent(str);
        String result = "";

        if (percent > LIMIT_PERCENT) {
            for (int i = 0; i < str.length(); i++) {
                if (isVowel(str.charAt(i))) {
                    result += "mommy";
                } else {
                    result += str.charAt(i);
                }
            }
        } else {
            result = str;
        }

        return result;

    }

    private boolean isVowel(char character) {
        return vowels.contains("" + character);
    }

    private double getPercent(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        return (double) count / str.length();
    }
}
