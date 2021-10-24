package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) throws Exception {

        if(inputNumber <= -2147483648) {
            throw new Exception("Exceeded limit");
        }

        boolean isNeg = inputNumber < 0;

        String strNumber = Integer.toString(Math.abs(inputNumber));
        int strLength = strNumber.length();
        char[] numberArr = new char[strLength];

        for (int i = 1; i <= strLength; i++) {
            numberArr[i - 1] = strNumber.charAt(strLength - i);
        }

        int result = Integer.parseInt(String.valueOf(numberArr));

        if (isNeg) {
            result *= -1;
        }

        return result;
    }
}
