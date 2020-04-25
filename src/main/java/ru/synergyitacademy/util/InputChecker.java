package ru.synergyitacademy.util;

public class InputChecker {

    /**
     * Check the input digit to belong the range between lowLimit and highLimit
     *
     * @param number    checked number
     * @param lowLimit  low limit
     * @param highLimit high limit
     * @return true - if check is correct, otherwise - false
     */
    public static final boolean inRange(int number, int lowLimit, int highLimit) {
        return number >= lowLimit && number <= highLimit;
    }
}
