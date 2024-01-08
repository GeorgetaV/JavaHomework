import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1. Создайте массив из 8 случайных целых чисел из интервала [1;50]
        //Выведите массив на консоль в строку.
        //Замените каждый элемент с нечетным индексом на ноль.
        //Снова выведете массив на консоль в отдельной строке.

        Integer[] arr = new Integer[8];
        Random random = new Random();

        for (int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(49) + 1;
        }
        System.out.print("исходный массив ");
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 !=0) {
                arr[i] = 0;
            }
        }
        System.out.print("Новый массив ");
        System.out.println(Arrays.toString(arr));
        System.out.println("******************** homework2 *******************");
        Homework2.main();
    }
}