package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void sortWord1() {

        //Arrange
        String expectedValue[] = {"apple","band","mangp","xaokda"};
        Sort s = new Sort();
        //Act
        String[] actualValue=s.sortWord("apple mangp band xaokda");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sortWord2() {

        //Arrange
        String expectedValue[] = {"cricket","football","hockey"};
        Sort s = new Sort();
        //Act
        String[] actualValue=s.sortWord("football cricket hockey");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}