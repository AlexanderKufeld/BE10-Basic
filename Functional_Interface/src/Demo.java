
import java.util.function.*;
    public class Demo {

        public static void main(String[] args) {

            String text = "abc defG ikl";
            Predicate<String> checkLength = s -> s.length() == 3;
            Function<String, String> toUpper = String::toUpperCase;

            System.out.println(text);
            System.out.println(transform(text, checkLength, toUpper));
            System.out.println(transform(text, s -> s.length() == 3, String::toUpperCase));
        }

        public static String transform (String text, Predicate < String > p, Function < String, String > f){
            String[] words = text.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (p.test(words[i])) {
                    words[i] = f.apply(words[i]);
                }
            }
            return String.join(" ", words);
        }
    }


