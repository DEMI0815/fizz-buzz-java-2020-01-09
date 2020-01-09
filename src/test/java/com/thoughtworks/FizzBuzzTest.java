package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_return_Fizz_given_input_divided_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(3);

        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_Buzz_given_input_divided_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(5);

        assertEquals(result, "Buzz");
    }

    @Test
    public void should_return_Whizz_given_input_divided_by_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(7);

        assertEquals(result, "Whizz");
    }

    @Test
    public void should_return_FizzBuzz_given_input_divided_by_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);

        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void should_return_BuzzWhizz_given_input_divided_by_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);

        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_input_divided_by_3_and_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(105);

        assertEquals(result, "FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_given_input_contain_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(13);

        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_Fizz_given_input_contain_3_and_divided_by_3_or_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(30);

        assertEquals(result, "Fizz");
    }
}