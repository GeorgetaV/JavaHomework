
import java.util.List;
import java.util.ArrayList;

public class MultipyBy22 {
    public static List<Integer> multiplyBy22(List<Integer> intList) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : intList) {
            result.add(num * 22);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4);
        System.out.println(multiplyBy22(intList));  // [22, 44, 66, 88]
    }
}