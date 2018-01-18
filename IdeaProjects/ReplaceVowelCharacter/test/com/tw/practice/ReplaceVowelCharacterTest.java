package com.tw.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceVowelCharacterTest {
    private ReplaceVowelCharacter replaceVC = new ReplaceVowelCharacter();

    @Test
    public void shouldReturnMommyWhenInputAVowel() {
        assertEquals("mommy", replaceVC.replace("a"));
    }

    @Test
    public void shouldReturnItselfWhenInputAConsonant() {
        assertEquals("b",replaceVC.replace("b"));
    }

}