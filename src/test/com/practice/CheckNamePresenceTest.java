package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNamePresenceTest {

    @Test
    public void nameCheck1() {

        Boolean expectedValue =true;
        //Act
        CheckNamePresence obj = new CheckNamePresence();
        Boolean actualValue = obj.nameCheck("This is Harry");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void nameCheck2() {

        Boolean expectedValue =false;
        //Act
        CheckNamePresence obj = new CheckNamePresence();
        Boolean actualValue = obj.nameCheck("This is Ron");
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}