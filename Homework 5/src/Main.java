import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
        //записанных в переменные m и n.
        //Числа могут быть, как целочисленные, так и дробные.
        //
        //
        //Например :
        //ввод : m=10.5, n=10.45
        //вывод: Число 10.45 ближе к 10.

        int const1 = 10;
        double tmp;
        double tmp2;
        System.out.println("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
//        double tmp = m - const1;
        System.out.println("Введите второе число: ");
        double n = sc.nextDouble();
//        double tmp2 = n - const1;
        if (m < const1) {
            tmp = const1 - m;
        } else {
            tmp = m - const1;
        }
        if (n < const1) {
            tmp2 = const1 - n;
        } else {
            tmp2 = n - const1;
        }
        if (tmp < tmp2) {
            System.out.println("Число "+ m + " ближе к 10");
        } else {
            System.out.println("Число "+ n + " ближе к 10");
        }
    }
}