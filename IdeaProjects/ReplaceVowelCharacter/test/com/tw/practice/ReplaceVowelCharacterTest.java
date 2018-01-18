package com.tw.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceVowelCharacterTest {
    private ReplaceVowelCharacter replaceVC = new ReplaceVowelCharacter();

    @Test
    public void shouldReturnMommyWhenInputAVowel() {
        assertEquals("mommy", replaceVC.replace("a"));
        assertEquals("mommy", replaceVC.replace("e"));
        assertEquals("mommy", replaceVC.replace("i"));
        assertEquals("mommy", replaceVC.replace("o"));
        assertEquals("mommy", replaceVC.replace("u"));
    }

    @Test
    public void shouldReturnItselfWhenInputAConsonant() {
        assertEquals("b",replaceVC.replace("b"));
    }

    @Test
    public void shouldReplaceAllVowelsWhenVowelsMoreThan30Percent() {
        assertEquals("Shmommy",replaceVC.replace("She"));
        assertEquals("python",replaceVC.replace("python"));
    }

}