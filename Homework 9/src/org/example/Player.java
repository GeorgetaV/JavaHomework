package org.example;


import java.util.Arrays;
import java.util.Scanner;
import static org.example.Constans.*;


public class Player {
    public String playerName;
    public int[] playerNumbers = new int[PLAYER_NUMBERS_QNTY];
    public int winsCount = 0;

    public Player() {
        inputPlayerName();
        inputPlayerNumbers();
    }

    public void inputPlayerName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name:");
        playerName = sc.nextLine();
    }

    public void inputPlayerNumbers() {
        Scanner sc = new Scanner(System.in);
        int tempNum;
        boolean[] userArrayForChecking = new boolean[ALL_NUMBERS_QNTY + 1];// создаем массив заданной длинны + 1 (чтобы использовать индекс от 1 до 50, а не 49, индекс 0 не используем) из булевых значений, которые по умолчанию false.
        //данный массив нужен для проверки уникальности номеров, введенных пользователем.
        for (int i = 0; i < playerNumbers.length; i++) {
            while (true) {
                System.out.println("Input your " + (i + 1) + " number (from 1 to 50)");
                tempNum = sc.nextInt();
                if ((tempNum < 1 || tempNum > ALL_NUMBERS_QNTY)) {
                    System.out.println("Your number is out of range. Try again");
                } else if (userArrayForChecking[tempNum]) {// если в массиве с булевыми значениями по индексу номера, введенного пользователем false, то значит такого числа пока не выпадало
                    System.out.println("Your number is not unique. Try again");
                } else{
                    playerNumbers[i] = tempNum;//записываем номер, введенный пользователем в массив с пользовательскими числами
                    userArrayForChecking[tempNum] = true;// присваиваем элементу из массива с булевыми значениями значение true, чтобы было понятно что это место уже занято числом.
                    // например, если игрок ввел число 3, то в массиве с булевыми значениями элемент с индексом 3 будет перезаписан true (место занято), а в массив с пользовательскими номерами попадет число 3.
                    break;
                }
            }
        }
    }

    public void compareNumbers() {  // сюда попадает arrayForChecking, в котором элементы с индексами равными выигрышным числам уже перезаписан true.

        for (int i = 0; i < playerNumbers.length; i++) {
            if (LuckyNumbers.arrayForChecking[playerNumbers[i]]){   // здесь сравнивается число, которое ввел пользователь с элементом массива с индексом равными этому числу,
                // например игрок ввел число 23: если элемент массива с индексом 23 будет true, значит 23 выигрышное число (мы меняли на true, если выпадал рандом равный этому индексу)
                winsCount++;
            }
        }
    }
}