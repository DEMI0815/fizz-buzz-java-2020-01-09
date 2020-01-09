package com.thoughtworks;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = "Fizz";
        } else
            result = String.valueOf(number);
        return result;
    }
}
