import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  1. Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
        //(проверьте количество букв в слове).
        //Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова.
        //распечатать на консоль.
        //Например:
        //ввод - mama, papa
        //вывод - mapa

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int length = str.length();
        int halfLength = length / 2;
        int length2 = str2.length();
        int halfLength2 = length2 / 2;
        check(length, length2);
        System.out.printf(str.substring(0, halfLength));
        System.out.println(str2.substring(halfLength2));



    }

    public static void check(int strNew, int str2New) {
        if (strNew % 2 == 0) {
            System.out.println("количество символов первого слова " + strNew);
        } else {
            System.out.println("Вы ввели нечетное первое слово. Введите четное ");
        }
        if (str2New % 2 == 0) {
            System.out.println("количество символов второго слова " + str2New);
        } else {
            System.out.println("Вы ввели нечетное второе слово. Введите четное");
        }
    }
}