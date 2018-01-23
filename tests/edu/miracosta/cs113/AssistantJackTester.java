package edu.miracosta.cs113;

import org.junit.Assert;//for assertTrue() method
import org.junit.Test;//for @Test

public class AssistantJackTester {
    @Test
    public void testCheckAnswer1() {
        testCheckAnswer(1, 1, 1, 1);
    }

    @Test
    public void testCheckAnswer2() {
        testCheckAnswer(2, 6, 10, 6);
    }

    //note there isn’t a “@Test” here!
    public void testCheckAnswer(int set, int w, int l, int m) {
        AssistantJack aj = new AssistantJack(set);
        Assert.assertTrue(aj.checkAnswer(w, l, m) == 0);
    }

}