package com.thoughtworks;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        String stringNumber = String.valueOf(number);
        String result = "";
        boolean isContains5 = stringNumber.contains("5");
        boolean isContains7 = stringNumber.contains("7");
        if (stringNumber.contains("3") && !isContains5) {
            return "Fizz";
        }
        if (number % 3 == 0 && (!isContains5 || isContains7)) {
            result += "Fizz";
        }
        if (number % 5 == 0 && !isContains7) {
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
