package com.tw.practice;

public class ReplaceVowelCharacter {
    private String vowels = "aeiouAEIOU";

    public String replace(String str) {
        if (vowels.contains(str)) {
            return "mommy";
        }
        return str;

    }
}
