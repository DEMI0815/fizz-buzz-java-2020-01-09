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

    @Test
    public void should_return_Buzz_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(5);

        assertEquals(result, "Buzz");
    }

    @Test
    public void should_return_Whizz_by_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(7);

        assertEquals(result, "Whizz");
    }

    @Test
    public void should_return_FizzBuzz_by_90() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(90);

        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void should_return_BuzzWhizz_by_140() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(140);

        assertEquals(result, "BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_by_210() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(210);

        assertEquals(result, "FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_contain_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(13);

        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_Fizz_by_30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(30);

        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_BuzzWhizz_contain_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(35);

        assertEquals(result, "BuzzWhizz");
    }

    @Test
    public void should_return_Fizz_given_input_contain_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getString(75);

        assertEquals(result, "Fizz");
    }

}