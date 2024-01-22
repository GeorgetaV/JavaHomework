package org.example;

import static org.example.Constans.*;

public class LuckyNumbers {
    public static boolean[] arrayForChecking = new boolean[ALL_NUMBERS_QNTY + 1];
    // создаем массив заданной длинны + 1 (чтобы использовать индекс от 1 до 50, а не 49, индекс 0 не используем) из булевых значений, которые по умолчанию false.
    // данный массив нужен для проверки уникальности выигрышных номеров и для последующего сравнения номеров, введенных пользователем.
    public static int[] luckyNumbers = new int[LUCKY_NUMBERS_QNTY];// создаем массив заданной длины для выигрышных номеров

    public static void createLuckyNumbers() {

        int tempNum;//создаем временную переменную
        for (int i = 0; i < luckyNumbers.length; i++) { // пробегаемся по массиву для выигрышных номеров
            while (true) {
                tempNum = (int) ((Math.random() * (ALL_NUMBERS_QNTY - 1)) + 1);//записываем в переменную рандомное значение из заданного диапазона
                if (!arrayForChecking[tempNum]) { // если в массиве с булевыми значениями по индексу рандома false, то значит такого числа пока не выпадало
                    luckyNumbers[i] = tempNum;// записываем рандомное значение в массив с выигрышными числами
                    arrayForChecking[tempNum] = true;// присваиваем элементу из массива с булевыми значениями значение true, чтобы было понятно что это место уже занято числом.
                    // например, если выпало в рандоме число 3, то в массиве с булевыми значениями элемент с индексом 3 будет перезаписан true (место занято), а в массив с выигрышными номерами попадет число 3.
                    break;
                }
            }
        }
    }


}