import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.time.LocalDate;
import java.util.function.*;

public class Functional {

        public static void main(String[] args) {

//        1. Given an integer, return a power of integer: 5 -> 25
            UnaryOperator<Integer> a = i -> i * i;
            System.out.println(a.apply(5));

//        2. Given a string, return modulo 2 of string length: "abcde" -> 1
            Function<String, Integer> f1 = f -> f.length() % 2;
            System.out.println(f1.apply("abcde"));

//        3. Given a string, return its in upper case: "ivan" -> "IVAN"
            UnaryOperator<String> stringA = s -> s.toUpperCase();
            System.out.println(stringA.apply("ivan"));

//        4. Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
            BiFunction<String, String, Integer> StringResult = (StringA, StringB) -> StringA.length() + StringB.length();
            System.out.println(StringResult.apply("abc", "de"));

//        5. Given 2 strings, print a sum of their lengths.
            BiConsumer<String, String> sumOfStrigsLength = (a1, b1) -> System.out.println((a1.length() + b1.length()));

//        6. Return a date of one week prior to today: "2020-05-30"
            Supplier<LocalDate> s1 = () -> LocalDate.now().minusWeeks(1);
            System.out.println(s1.get());

//        7. Given a string, return a string, which consists of a first half of its character, if length is even, returns an empty string otherwise: "abcde" -> "ab", "abcde" -> "".
            UnaryOperator<String> unary = s -> {
                if (s.length() % 2 == 0) return s.substring(0, s.length() / 2);
                return "";
            };
            System.out.println(unary.apply("abcd"));
            System.out.println(unary.apply("abcde"));

//        8. Return a random number
            Supplier<Double> supplier1 = () -> Math.random();
            System.out.println(supplier1.get());

            Supplier<Integer> supplier2 = () -> {
                Double d = Math.random() * 100;
                return d.intValue();
            };
            System.out.println(supplier2.get());

//        9. Given a string, return a reversed string: "abc" ->"cba"
            UnaryOperator<String> unary1 = s -> {
                StringBuilder sb = new StringBuilder(s);
                sb = sb.reverse();
                return String.valueOf(sb);
            };
            System.out.println(unary1.apply("abc"));

//        10. Given a number, return a reversed number: 12345 -> 54321
            UnaryOperator<Integer> unary2 = u -> {
                int i = 0;
                while (u > 0) {
                    i += u % 10;
                    i *= 10;
                    u = u / 10;
                }
                return i / 10;
            };
            System.out.println(unary2.apply(12345));

//        11. Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false
            Predicate<Integer> p1 = num -> num % 2 == 0;
            System.out.println(p1.test(6));
            System.out.println(p1.test(25));

//        12. Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
            // ??? "is more than 3" or "and gleich"?)
            Predicate<String> p2 = s -> s.length() >= 3;
            System.out.println(p2.test("ab"));
            System.out.println(p2.test("abc"));

//        13. Given a string and a number x. Return true, if length of string is more than x, false otherwise. Hint: BiPredicate.
            BiPredicate<String, Integer> bp = (string_A, b) -> string_A.length() > b;

//    Print a given string
            Consumer<String> consumer = System.out::println;
            consumer.accept("string");

//    Given a string, return a lower case string
            UnaryOperator<String> unaryString = String::toLowerCase;
            System.out.println(unaryString.apply("STRING"));

//    Given a number, return a square root from the number
            UnaryOperator<Double> un2 = Math::sqrt;

//    Implement solution 7 from above as a method reference
//        String is not a functional interface

//    Given a class Employee with name and salary. Return an employee salary using 1. Supplier, 2. Function.
//        Supplier<Employee> supplier = ()->{
//            return new Employee("Vasja", 100);
//        };
            Supplier<Employee> supplier = Employee::new;
            Function<Employee, Integer> function2 = Employee::getSalary;
        }

    }

    class Employee {
        private String name;
        private int salary;

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public Employee() {

        }
    }

