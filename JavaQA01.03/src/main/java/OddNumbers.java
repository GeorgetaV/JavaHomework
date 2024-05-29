import java.util.List;
import java.util.ArrayList;

public class OddNumbers {
    public static List<Integer> filterOddNumbers(List<Integer> intList) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : intList) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(filterOddNumbers(intList));  // [1, 3, 5]
    }
}

