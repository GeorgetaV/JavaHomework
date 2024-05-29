import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTr {
    public static void main(String[] args) {
        // Создание и заполнение списка 10 миллионами элементов
        List<Integer> list = new ArrayList<>(10_000_000);
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        // 1. Перебор с использованием for-each loop
        long startTime = System.nanoTime();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.nanoTime();
        System.out.println("For-each loop: " + (endTime - startTime) + " ns");

        // 2.
        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Classic for with list.size() in loop: " + (endTime - startTime) + " ns");

        // 3.
        startTime = System.nanoTime();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Classic for with size in variable: " + (endTime - startTime) + " ns");

        // 4.
        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Classic for with size in variable, iterating backwards: " + (endTime - startTime) + " ns");

        // 5. Использование Iterator
        startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.nanoTime();
        System.out.println("Iterator: " + (endTime - startTime) + " ns");

        // 6. Использование ListIterator
        startTime = System.nanoTime();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.nanoTime();
        System.out.println("ListIterator: " + (endTime - startTime) + " ns");
    }
}

