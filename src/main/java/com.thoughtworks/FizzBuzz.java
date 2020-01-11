package com.thoughtworks;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final int FIZZ_NUM = 3;
    private static final int BUZZ_NUM = 5;
    private static final int WHIZZ_NUM = 7;

    public String getString(int number) {
        String result = "";
        String stringNum = String.valueOf(number);
        if (contains(stringNum, FIZZ_NUM) && !contains(stringNum, BUZZ_NUM)) {
            return FIZZ;
        }
        if (divide(number, FIZZ_NUM)) {
            result += FIZZ;
        }
        if (divide(number, BUZZ_NUM)) {
            result += BUZZ;
        }
        if (divide(number, WHIZZ_NUM)) {
            result += WHIZZ;
        }
        return result.equals("") ? String.valueOf(number) : result;
    }

    private boolean contains(String stringNum, int containsNum) {
        return stringNum.contains(containsNum+"");
    }

    private boolean divide(int number, int dividedNumber) {
        return number % dividedNumber == 0;
    }
}
