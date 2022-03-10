package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    @DisplayName("Given a number should return the fibonacci number at that position")
    void givenANumberShouldReturnTheFibonacciNumberAtThatPosition() {
        int position = 10;
        int expected = 55;
        Assertions.assertEquals(expected, Fibonacci.findNumber(position));
    }

    @Test
    @DisplayName("Given a number should return the fibonacci sequence at that position")
    void givenANumberShouldReturnTheFibonacciSequenceAtThatPosition() {
        int position = 8;
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        Assertions.assertArrayEquals(expected, Fibonacci.getSequence(position));
    }


}
