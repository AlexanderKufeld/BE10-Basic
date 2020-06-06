import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class AnagramTest {

    @Test
    public void testAnagram_1() {
        String[] vocabulary = {"anna", "ivan", "naan", "vani", "piotr", "nana", "navi"};
        Anagram anagram = new Anagram(vocabulary);
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "ivan", "vani", "navi");
        List<String> actual = anagram.getAnagrams("ivan");
        assertEquals(expected, actual);
    }

    @Test
    public void testAnagram_2() {
        String[] vocabulary = {"anna", "ivan", "naan", "vani", "piotr", "nana", "navi"};
        Anagram anagram = new Anagram(vocabulary);
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "anna", "naan", "nana");
        List<String> actual = anagram.getAnagrams("anna");
        assertEquals(expected, actual);
    }

}