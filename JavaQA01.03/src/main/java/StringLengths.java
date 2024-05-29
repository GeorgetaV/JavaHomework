import java.util.ArrayList;
import java.util.List;

public class StringLengths {
    public static List<Integer> stringLengths(List<String> strList) {
        List<Integer> result = new ArrayList<>();
        for (String str : strList) {
            result.add(str.length());
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strList = List.of("apple", "banana", "cherry");
        System.out.println(stringLengths(strList));  // [5, 6, 6]
    }
}