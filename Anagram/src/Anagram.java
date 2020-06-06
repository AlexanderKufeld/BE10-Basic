import java.util.*;

public class Anagram {

    public static String[] vocabulary = {"anna", "ivan", "naan", "vani", "piotr", "nana", "navi"};
    Map<String, List<String>> map = new HashMap<>();

    public Anagram(String[] vocabulary) {
        buildVocabularyMap(vocabulary);
    }

    public String WordSorting(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<String> getAnagrams(String word) {
        String KeyWord = WordSorting(word);
        return map.get(KeyWord);
    }

    private void buildVocabularyMap(String[] vocabulary) {
        for (String v : vocabulary) {
            String KeyWord = WordSorting(v);
            List<String> anagramList = map.get(KeyWord);

            if (anagramList == null) {

                anagramList = new ArrayList<>();

                anagramList.add(v);

                map.put(KeyWord, anagramList);

            } else {

                anagramList.add(v);

            }

        }

    }


}