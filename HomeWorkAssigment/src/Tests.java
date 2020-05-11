
import org.junit.Test;
import java.util.*;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {


    /*1. Есть два класса: Address с полями улица и номер дома и
        Person с полями имя и Address. Нужно написать функцию:

        List<Address> getAddresses(List<Person> persons)

        то есть по списку persons возвращать список их адресов. */


        @Test
        public void testGetAddresses() {
            Main.Address a= new Main.Address("a str", 1);
            Main.Address b = new Main.Address("b str", 2);
            Main.Address c = new Main.Address("c str", 3);
            List<Main.Person> pList = new LinkedList<>();
            pList.add(new Main.Person("Petya", "a"));
            pList.add(new Main.Person("Vasya","b" ));
            pList.add(new Main.Person("Kolya", "c"));

            List<Main.Address> aListExpected = new LinkedList<>();
            aListExpected.add(a);
            aListExpected.add(b);
            aListExpected.add(c);

            for (int i = 0; i < pList.size(); i++) {
                assertEquals(aListExpected.get(i), pList.get(i).Address);
            }
        }


     /*2. Есть список с именами: ​ Ivan, Maria, Stephan, John, Amalia​ .
        Написать функцию, которая вернет список, в котором не содержатся имена исходного списка, длиной 4. */

     public static class NamesNamesWithoutFour{
         @Test

         public void tesNamesWithoutFour() {
             List<String> myList = new LinkedList<>();
             Collections.addAll(myList, "Ivan", "Maria", "Stephan", "John", "Amalia");
             List<String> expectedList = new LinkedList<>();
             Collections.addAll(expectedList,"Maria", "Stephan", "Amalia");
             assertEquals(3, myList.size());
             for (int i = 0; i < myList.size(); i++) {
                 assertEquals(expectedList.get(i), myList.get(i));
             }
         }
     }


    /*3. Есть два списка одинаковой длины с числами. Написать функцию, которая вернет список с элементами Yes или No,
         где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i.
         Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {No, Yes, Yes, No} */



        @Test
        public List<String> compareLists() {
         List<Integer> listI1 = new ArrayList<>();
            List<Integer> listI2 = new ArrayList<>();
            Collections.addAll(listI1, 1, 2, 3, 4);
            Collections.addAll(listI2, 5, 2, 3, 8);
            List<String> actualList = compareLists();
            List<String> expectedList = new LinkedList<>();
            Collections.addAll(expectedList, "No", "Yes", "Yes", "No");
            assertEquals("size", expectedList.size(), actualList.size());
            for (int i = 0; i < listI1.size(); i++) {
            assertEquals(expectedList.get(i), actualList.get(i));
            }

 /*4. Есть два списка с буквами. Определить, является ли один список циклической версией другого.
        Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb} результат будет true, а для {dd, ee, ff} и {dd, ff, ee} - false.*/

 @Test
                public  boolean testCycle1(){
                List<String> list1 = new LinkedList<>();
                Collections.addAll(list1, "aa", "bb", "cc", "dd");

                List<String> list2 = new LinkedList<>();
                Collections.addAll(list2, "cc", "dd", "aa", "bb");

                boolean akt = Main.cycle(list1, list2);
                assertTrue(akt);
            }
@Test
            public  boolean testCycle2(){
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1,"dd", "ee", "ff");
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "dd", "ff", "ee");
        boolean akt = Main.cycle(list1,list2);
        Assert.assertFalse(akt);
    }

    @Test
    public boolean testCycle3(){
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1,"dd", "ee", "ff");
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "ff", "dd", "ee");
        boolean akt = Main.cycle(list1,list2);
        assertTrue(akt);
    }
}

    /*5. Написать функцию, которая реверсирует список, возвращает список элементов в обратном порядке. {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1} */


     @Test

     public List testReversList() {
         List list = new ArrayList();
         Collections.addAll(list, 1, 2, 3, 4, 5);
         List actualList = testReversList();
         List expectedList = new ArrayList();
         Collections.addAll(expectedList, 5, 4, 3, 2, 1);
         assertEquals(expectedList.size(), actualList.size());
         for (int i = 0; i < actualList.size(); i++) {
             assertEquals(expectedList.get(i), actualList.get(i));
         }
     }

    /*6. Объединить два списка в один.  */


public class testUnite {
     @Test
     public void testCombinationInt() {
         List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();
         Collections.addAll(list1, 1, 2, 3);
         Collections.addAll(list2, 4, 5, 6);

         List<Integer> aList = new ArrayList();

         List<Integer> expectionList = new ArrayList<>();
         Collections.addAll(expectionList, 1, 2, 3, 4, 5, 6);
         assertEquals("size", expectionList.size(), aList.size());
         for (int i = 0; i < aList.size(); i++) {
             assertEquals(expectionList.get(i), aList.get(i));
         }
     }

     @Test
     public void testUnite() {
         List<String> list1 = new ArrayList<>();
         List<String> list2 = new ArrayList<>();
         Collections.addAll(list1, "aa", "bb", "cc");
         Collections.addAll(list2, "dd", "ee", "ff");

         List<String> actualList = new ArrayList<>();
         List<String> expectionList = new ArrayList<>();
         Collections.addAll(expectionList, "aa", "bb", "cc", "dd", "ee", "ff");
         assertEquals("size", expectionList.size(), actualList.size());
         for (int i = 0; i < actualList.size(); i++) {
             assertEquals(expectionList.get(i), actualList.get(i));
         }
     }
 }
     /*7. Есть список с целыми числами. Написать функцию, которая вернет список без элементов, больше заданного.
      */


         @Test

         public void testBeforeNumber() {
             int number = 3;
             List<Integer> list = new ArrayList();
             Collections.addAll(list, 1, 2, 3, 4, 5);
             List<Integer> actualList = Main.withoutElements(list, number);
             List<Integer> expectedList = new ArrayList();
             Collections.addAll(expectedList, 1, 2, 3);
             for (int i = 0; i < actualList.size(); i++) {
                 assertEquals(expectedList.get(i), actualList.get(i));
             }
         }

         @Test

         public void testBeforeNumber1() {
             int number = 5;
             List<Integer> list = new ArrayList();
             Collections.addAll(list, 5, 4, 6, 7, 1);
             List<Integer> actualList = Main.withoutElements(list, number);
             List<Integer> expectedList = new ArrayList();
             Collections.addAll(expectedList, 5, 4, 1);
             for (int i = 0; i < actualList.size(); i++) {
                 assertEquals(expectedList.get(i), actualList.get(i));
             }
         }


                                        //Множества

  /*  1. С использованием множеств (Set) реализовать функцию, которая вернет список без повторяющихся элементов:
        List<String> removeDuplicates(List<String> input)

        Пример:​ {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”, “Piotr”, “Anna”} */
  @Test

  public void testRemoveDuplicates(){
      List<String> input = new ArrayList<>();
      Collections.addAll(input,"Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
      LinkedHashSet<String> exp = new LinkedHashSet<>();
      Collections.addAll(exp,"Ivan", "Maria", "Piotr", "Anna");
      Set<String> akt = Main.removeDuplicates(input);
      Assert.assertEquals(exp,akt);
  }


    /*2. С использованием множеств реализовать функцию, которая вернет повторяющиеся элементы из данного списка:

    List<String> getDuplicates(List<String> input)

    Пример: ​ {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”}*/


    @Test
    public void testGetDuplicates() {
        List<String> input = new ArrayList<>();
        Collections.addAll(input, "Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        Set<String> exp = new LinkedHashSet<>();
        Collections.addAll(exp, "Ivan", "Maria");
        Set<String> akt = Main.getDuplicates(input);
        Assert.assertEquals(exp, akt);
    }


                                        // Мапы
    /*1. Дана Map<String, String> map, написать функцию, которая вернет Мап, такую,
    если в есходной map есть ключ ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.

    Примеры:

    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"} mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}*/


        // mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}

        @Test

        public void testModifyMaps1() {

            Map<String, String> map = new LinkedHashMap<>();
            map.put("a", "Hi");
            map.put("b", "There");
            Map<String, String> actual   = new LinkedHashMap<>();
            Map<String, String> expected = new LinkedHashMap<>();
            expected.put("a", "Hi");
            expected.put("ab", "HiThere");
            expected.put("b", "There");
            assertTrue("size", expected.size() == actual.size());
            for (String k : actual.keySet()) {
                assertEquals(expected.get(k), actual.get(k));
            }
        }

        @Test
        public void testModifyMaps2() {
            Map<String, String> map = new LinkedHashMap<>();
            map.put("a", "Hi");
            Map<String, String> actual = new LinkedHashMap<>();
            Map<String, String> expected = new LinkedHashMap<>();
            expected.put("a", "Hi");
            assertTrue("size", expected.size() == actual.size());
            for (String k : actual.keySet()) {
                assertEquals(expected.get(k), actual.get(k));
            }
        }

        @Test
        public void testModifyMaps3() {
            Map<String, String> map = new LinkedHashMap<>();
            map.put("b", "There");
            Map<String, String> actual = new LinkedHashMap<>();
            Map<String, String> expected = new LinkedHashMap<>();
            expected.put("b", "There");
            assertTrue("size", expected.size() == actual.size());
            for (String k : actual.keySet()) {
                assertEquals(expected.get(k), actual.get(k));
            }

/*2. Дан массив букв, вернуть мапу Map<String, Boolean> где каждая строка является ключем, а значением true, если строка в массиве больше одного раза и false, если только один раз.

    Примеры:

    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
        @Test
        public void testMapBoolean1() {
            String[] arr = {"a", "b", "a", "c", "b"};
            Map<String, Boolean> act = Main.wordMultiple(arr);
            Map<String, Boolean> exp = new LinkedHashMap<>();
            exp.put("a", true);
            exp.put("b", true);
            exp.put("c", false);
            assertTrue("size", exp.size() == act.size());
            for (String k : act.keySet()) {
                assertEquals(exp.get(k), act.get(k));
            }
        }

        @Test
        public void testMapBoolean2() {
            String[] arr = {"c", "b", "a"};
            Map<String, Boolean> act = Main.wordMultiple(arr);
            Map<String, Boolean> exp = new LinkedHashMap<>();
            exp.put("a", false);
            exp.put("b", false);
            exp.put("c", false);
            assertTrue("size", exp.size() == act.size());
            for (String k : act.keySet()) {
                assertEquals(exp.get(k), act.get(k));
            }
        }

        @Test
        public void testMapBoolean3() {
            String[] arr = {"c", "c", "c", "c"};
            Map<String, Boolean> actual1 = Main.wordMultiple(arr);
            Map<String, Boolean> expected1 = new LinkedHashMap<>();
            expected1.put("c", true);
            assertTrue("size", expected1.size() == actual1.size());
            for (String k : actual.keySet()) {
                assertEquals(expected1.get(k), actual1.get(k));
            }
        }

/*3. Анаграмма слова x  - слово, по длине равное x и состоящее из таких же букв, что и x.
Например, слово “vani” является анаграммой слова “ivan”, а слова “naan” и “anan” являются анаграммами слова “anna”.
Дан словарь, сожержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
Например, по слову “ivan” функция вернет {“navi”, “vani”}*/

    @Test

    public void testMapAnagram() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "anna", "ivan", "naan", "vani", "piotr", "nana", "navi");
        List<String> actual2 = new ArrayList<>();
        actual = (Map<String, String>) new Main.Anagram();
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "navi", "vani");
    }

    @Test
    public void testMapAnagram2() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "anna", "ivan", "naan", "vani", "piotr", "nana", "navi");
        List<String> actual = new ArrayList<>();
        actual = (List<String>) new Main.Anagram();
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "navi", "vani");
    }


/*4. Дан список имен, где некоторые имена повторяются.
 Написать функцию, которая по имени вернет количество вхождений этого имени в список.  */

            @Test
            public void testNameCount1(){
                List<String> list = Arrays.asList("Anna", "Pit", "Anna", "John", "Anna", "Pit");
                String str = "Anna";
                Map<String, Integer> a = (Map<String, Integer>) new Main.nameCount();
                Map<String, Integer> e = new HashMap<>();
                expected.put("Anna", 3);
                assertEquals(e.keySet(), a.keySet());
                assertEquals(e.get(str), a.get(str));
            }

            @Test

            public void testNameCount2() {
                List<String> list = Arrays.asList("Anna", "Pit", "Anna", "John", "Anna", "Pit");
                String str = "Anna";
                Map<String, Integer> actual = new Main.nameCount();
                Map<String, Integer> expected = new HashMap<>();
                expected.put("Anna", 3);
                assertEquals(expected.keySet(), actual.keySet());
                assertEquals(expected.get(str), actual.get(str));
            }

/*5. Дан текст, подсчитать, какое слово встречается больше остальных. Слова в предложениях могут разделяться запятыми, точками, пробелами.
Предлоги [в, на, из, под] и остальные не учитывать при подсчете.
 */
            @Test
            public void testMaxWordCount() {
                String str = "If the value for the specified key is present and non-null," +
                        " attempts to compute a new mapping given the key and its current mapped value.";
                Map<String, Integer> actual = new Main.MaxWordCount(str);
                Map<String, Integer> expected = new HashMap<>();
                expected.put("value", 2);
                assertEquals(expected.keySet(), actual.keySet());
                assertEquals(expected.get(str), actual.get(str));
            }

}

