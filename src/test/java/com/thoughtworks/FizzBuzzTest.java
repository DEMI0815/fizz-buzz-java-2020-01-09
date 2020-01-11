package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_return_Fizz_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(3);

        assertEquals(result, "Fizz");
    }

}