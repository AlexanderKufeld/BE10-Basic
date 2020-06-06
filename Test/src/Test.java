import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<String> isEven = Test::test;
        System.out.println(isEven.test("abc"));
        List<String> names = Arrays.asList("anna", "piotr", "sidor");
        Iterator<String> iterator = names.iterator();
        names.stream().
    }

    private static boolean test(String s) {
        return s.length() % 2 == 0;
    }


}