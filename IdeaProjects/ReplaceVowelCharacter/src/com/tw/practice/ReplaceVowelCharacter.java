package com.tw.practice;

public class ReplaceVowelCharacter {
    private String vowels = "aeiouAEIOU";
    private final double LIMIT_PERCENT = 0.30;

    public String replace(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains("" + str.charAt(i))) {
                count++;
            }
        }
        double percent = (double) count / str.length();
        String result = "";

        if (percent > LIMIT_PERCENT) {
            for (int i = 0; i < str.length(); i++) {
                if (vowels.contains("" + str.charAt(i))) {
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
}
