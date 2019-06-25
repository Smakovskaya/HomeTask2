package org.itstep;

public class Main {
    public static void main(String[] args) {
        int resultByDiv = getSumByDiv(12345);
        System.out.println(resultByDiv);

        int resultSyString = getSumByString(12345);
        System.out.println(resultSyString);
    }

    private static int getSumByString(int number) {
        int result = 0;
        String numberAsString = String.valueOf(number);
        char[] symbols = numberAsString.toCharArray();

        for (char symbol : symbols){
            result += Character.getNumericValue(symbol);
        }
        return result;
    }

    private static int getSumByDiv(int number) {
        int result = 0;
        while (number !=0){
            result += number % 10;
            number = number / 10;
        }

        return result;
    }
}
