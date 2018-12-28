package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharReplaceTest {

    @Test
    public void replaceChar1() {

        String expectedValue ="faity fry";
        //Act
        CharReplace obj = new CharReplace();
        String actualValue = obj.replaceChar("daily dry");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void replaceChar2() {

        String expectedValue ="fairy mitk";
        //Act
        CharReplace obj = new CharReplace();
        String actualValue = obj.replaceChar("dairy milk");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}