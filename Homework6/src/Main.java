import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых
// зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.

//        boolean isEdekaOpen = true;
//        boolean isReweOpen = false;
//
//        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
//        System.out.println("Я могу купить еду, это " + canBuy);
//
//    }
//
//    public static boolean canBuy(boolean edekaOpen, boolean reweOpen) {
//        if (edekaOpen || reweOpen) {
//            return true;
//        } else {
//            return false;
//        }
//    }

        // 2. Реализуйте программу,
        // которая попросит пользователя ввести год и
        // напечатать этот год isLeap (високосный) или нет.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите год, в формате: 1968");
//        int year = sc.nextInt();
//
//        if (year % 4 == 0 ) {
//            System.out.println("год высокосный");
//
//        } else {
//            System.out.println("год не высокосный");
//        }

        // 3. Реализуйте программу, которая попросит
        // пользователя ввести три целых числа (используйте сканер)
        // и напечатает максимум из трех чисел.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = sc.nextInt();
        System.out.println("Введите второе целое число");
        int b = sc.nextInt();
        System.out.println("Введите третье целое число");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        } else if (a > b && a < c) {
            System.out.println(c);
        } else if (a < b && a > c){
            System.out.println(b);
        }

        // *Дополнительно
        //Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
        // его цифр (заранее не известно сколько цифр будет в числе).
        //
        //
        //Например:
        //Ввод = 12345
        //Вывод = 1+2+3+4+5 = 15




    }
}