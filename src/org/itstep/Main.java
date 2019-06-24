package org.itstep;

public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;        // обьявляем переменную и присваиваем ей значение 0
        int a = 0;
        String s = String.valueOf(number);  // переменную number преобразуем в строку
        int numbers = s.length();           // находим длинну этой строки
        for (int i = 0; i < numbers; i++) {   // цикл длится столько, сколько символов в строке
            a = Integer.parseInt(Character.toString(s.charAt(i)));  //Получаем Итый символ и преобразуем его в тип Integer
            sum = a + sum;   // Каждый цикл к полученной цифре прибавляем сумму
        }

        System.out.println(sum);
    }
}



