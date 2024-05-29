import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class UnicalinieElementi {
    public static void main(String[] args) {
        // Создание и заполнение списка 500 случайными элементами от 0 до 9
        List<Integer> list = new ArrayList<>(500);
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            int element = random.nextInt(10);
            list.add(element);
        }

        //Отсортированный набор уникальных элементов
        Set<Integer> sortedUniqueElements = new TreeSet<>(list);
        System.out.println("Отсортированный набор уникальных элементов: " + sortedUniqueElements);

        //Набор только уникальных элементов
        Set<Integer> uniqueElements = new HashSet<>(list);
        System.out.println("Набор только уникальных элементов: " + uniqueElements);
    }
}
