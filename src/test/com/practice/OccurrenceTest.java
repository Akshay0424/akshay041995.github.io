package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceTest {

    @Test
    public void charCount1() {

        int expectedValue =4;
        //Act
        Occurrence obj = new Occurrence();
        int actualValue = obj.charCount("java is java",'a');

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}