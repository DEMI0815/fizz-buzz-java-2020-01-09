package com.thoughtworks;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        if (result == ""){
            result = String.valueOf(number);
        }
        return result;
    }
}
