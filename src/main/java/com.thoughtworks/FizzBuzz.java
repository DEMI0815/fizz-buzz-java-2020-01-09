package com.thoughtworks;

public class FizzBuzz {
    public String getString(int number) {
        String result = fizzBuzz(number);
        if (result.equals("")) {
            return String.valueOf(number);
        }
        return result;
    }

    private String fizzBuzz(int number) {
        String stringNumber = String.valueOf(number);
        boolean isContains5 = stringNumber.contains("5");
        boolean isContains7 = stringNumber.contains("7");

        if (stringNumber.contains("3") && !isContains5) {
            return "Fizz";
        }

        String result = "";
        if (number % 3 == 0 && (!isContains5 || isContains7)) {
            result += "Fizz";
        }
        if (number % 5 == 0 && !isContains7) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        return result;
    }
}
