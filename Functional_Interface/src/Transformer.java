
import java.util.function.*;
public class Transformer {

    public static String transform (String text, Predicate<String> p, Function<String, String> f) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (p.test(words[i])) {
                words[i] = f.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }
}
