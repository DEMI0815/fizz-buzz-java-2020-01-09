package com.thoughtworks;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final int FIZZ_NUM = 3;
    private static final int BUZZ_NUM = 5;
    private static final int WHIZZ_NUM = 7;

    public String getString(int number) {
        if (divide(number, FIZZ_NUM)) {
            return FIZZ;
        }
        if (divide(number, BUZZ_NUM)) {
            return BUZZ;
        }
        if (divide(number, WHIZZ_NUM)) {
            return WHIZZ;
        }
        return String.valueOf(number);
    }

    private boolean divide(int number, int dividedNumber) {
        return number % dividedNumber == 0;
    }
}
