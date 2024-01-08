import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Представим, что у нас есть устройство, в котором две колбы.
        //Прибор работает корректно, если температура первой колбы выше 100 градусов,
        // а температура второй колбы меньше 100 градусов.
        //Вы должны написать метод, который проверяет это устройство.
        //Ваша программа должна иметь переменные temperature1 и temperature2.
        //В результате метод возвращает true или false.

//        boolean check = check2(110, 10);
//        System.out.println(check);


    }

//    public static boolean check2(int temp1, int temp2) {
//        if (temp1 > 100 && temp2 < 100) {
//            return true;
//        }
//        return false;
//    }

    // 2. У вас на банковском счету N долларов.
    //Вы хотите снять все, но банк разрешает снять только сумму, которая является
    // делителем текущей суммы на счету и меньше текущей суммы.
    //Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится,
    // чтобы забрать все свои деньги из банка?
    //Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
    //
    //
    //Ввод:  N = 21
    //Выход:  7
    //Объяснение:  N = 21
    //Снято 7, осталось = 14
    //Снято 7, осталось = 7
    //Снято 1, осталось = 6
    //Снято 3, осталось = 3
    //Снято 1, осталось = 2
    //Снято 1, Осталось = 1
    //Снято 1, осталось = 0

//    public static void bank() {
//
//        Scanner sc = new Scanner(System.in);
//        int konto = sc.nextInt();
//        System.out.println("У вас на счету " + konto);
//
//        for (int delitel = 1; delitel < konto; delitel++) {
//            if (konto % delitel == 0) {
//                System.out.println("Это делитель. Вы можете снять: " + delitel);
//            }
//        }
//        System.out.println("Какую сумму вы хотите снять?");
//        Scanner sc2 = new Scanner(System.in);
//        int moneyOff = sc2.nextInt();
//        System.out.println("Вы снимаете " + moneyOff + " на счету осталось " + (konto-moneyOff));
//    }
}