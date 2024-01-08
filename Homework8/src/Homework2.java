
import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main() {

        // 2.Создайте массив из 5 случайных целых чисел из интервала [10;99]
        //Выведите его на консоль в строку.
        //Определите и выведите на экран сообщение о том, является ли массив
        // строго возрастающей последовательностью.


        Integer[] arr1 = new Integer[5];
        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(89) + 10;
        }
        System.out.print("исходный массив ");
        System.out.println(Arrays.toString(arr1));

//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[0] < arr1[1]
//                    && arr1[1] < arr1[2]
//                    && arr1[2] < arr1[3]
//                    && arr1[3] < arr1[4]){
//                System.out.println("массив со строго возрастающей последовательностью.");
//            } else {
//                System.out.println("массив с не возрастающей последовательностью.");
//            }
//        }
        int index = second(arr1);
        if (index == 1) {
            System.out.println("массив со строго возрастающей последовательностью.");
        } else {
            System.out.println("массив с не возрастающей последовательностью.");
        }
    }

    public static int second(Integer[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[0] < arr1[1]
                    && arr1[1] < arr1[2]
                    && arr1[2] < arr1[3]
                    && arr1[3] < arr1[4]) {
                return 1;
            }
        }
        return 0;
    }
}
