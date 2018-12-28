package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    @Test
    public void transpose1() {

        String expectedValue ="sihT si yrraH";
        //Act
        Transpose obj = new Transpose();
        String actualValue = obj.transpose("This is Harry");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void transpose2() {

        String expectedValue ="olleH avaJ";
        //Act
        Transpose obj = new Transpose();
        String actualValue = obj.transpose("Hello Java");
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}