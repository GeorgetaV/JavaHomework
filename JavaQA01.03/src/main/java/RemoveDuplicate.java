import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static List<String> removeDuplicates(List<String> strList) {
        Set<String> set = new LinkedHashSet<>(strList);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<String> strList = List.of("apple", "banana", "apple", "cherry", "banana");
        System.out.println(removeDuplicates(strList));  // [apple, banana, cherry]
    }
}
