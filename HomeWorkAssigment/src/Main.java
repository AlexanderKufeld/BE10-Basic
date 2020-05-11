import java.util.*;

public class Main {
   
        // Списки

   /*1. Есть два класса: Address с полями улица и номер дома и
        Person с полями имя и Address. Нужно написать функцию:

        List<Address> getAddresses(List<Person> persons)

        то есть по списку persons возвращать список их адресов. */
        public static class Address {
            String street;
            int num;

            public Address(String street, int num) {
                this.street = street;
                this.num = num;

            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", num=" + num +
                        '}';
            }
        }

        public static class Person {
            String name;
            String Address;

            public Person(String name, String Address) {
                this.name = name;
                this.Address = Address;
            }

            public List<String> getAddress(List<Person> persons) {
                List<String> list = new LinkedList<>();
                for (Person p : persons) {
                    list.add(p.Address);
                }
                return list;
            }
        }

   /*2. Есть список с именами: ​ Ivan, Maria, Stephan, John, Amalia​ .
        Написать функцию, которая вернет список, в котором не содержатся имена исходного списка, длиной 4. */

        public List<String> NamesWithoutFour () {
            List<String> list = new ArrayList<>();
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()) {
                String name = iterator.next();
                if (name.length() == 4) {
                    iterator.remove();
                }
            }
            return list;
        }

    /*3. Есть два списка одинаковой длины с числами. Написать функцию, которая вернет список с элементами Yes или No,
         где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i.
         Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {No, Yes, Yes, No} */


        public List<String> compareLists (List < Integer > list1, List < Integer > list2){
            List<String> compareResult = new LinkedList<>();
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) == list2.get(i)) {
                    compareResult.add("Yes");
                } else {
                    compareResult.add("No");
                }
            }
            return compareResult;
        }

    /*4. Есть два списка с буквами. Определить, является ли один список циклической версией другого.
        Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb} результат будет true, а для {dd, ee, ff} и {dd, ff, ee} - false.*/

        public static boolean cycle (List < String > list1, List < String > list2){
            if (list1.size() == list2.size()) {
                for (int i = list1.size(); i >= 0; i--) {
                    Collections.rotate(list1, 1);
                    if (list1.equals(list2))
                        return true;
                }
            }
            return false;
        }


    /*5. Написать функцию, которая реверсирует список,
    возвращает список элементов в обратном порядке. {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1} */


        public List<Integer> reversList (List < Integer > list) {
            LinkedList reversList = new LinkedList<>();
            for (int i = 0; i < list.size(); i++) {
                reversList.addFirst(list.get(i));
            }
            return reversList;
        }



        /*6. Объединить два списка в один.  */


        public static List<Objects> unite (List < Objects > list1, List < Objects > list2){
            List<Objects> uniteList = new LinkedList<>();
            uniteList.addAll(list1);
            uniteList.addAll(list2);
            return uniteList;
        }


        /*7. Есть список с целыми числами. Написать функцию, которая вернет список без элементов, больше заданного.*/


        public static List<Integer> withoutElements (List < Integer > list,int n){
            List<Integer> listWithoutElements = new LinkedList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= n) {
                    listWithoutElements.add(list.get(i));
                }
            }
            return listWithoutElements;
        }


        //Множества


  /*  1. С использованием множеств (Set) реализовать функцию, которая вернет список без повторяющихся элементов:
        List<String> removeDuplicates(List<String> input)

        Пример:​ {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”, “Piotr”, “Anna”} */

        public static Set<String> removeDuplicates (List < String > input) {
            return new LinkedHashSet<>(input);
        }


    /*2. С использованием множеств реализовать функцию, которая вернет повторяющиеся элементы из данного списка:

    List<String> getDuplicates(List<String> input)

    Пример: ​ {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”}*/

        public static Set<String> getDuplicates (List < String > input) {
            Set<String> uniqueList = new LinkedHashSet<>();
            Set<String> duplicatesList = new LinkedHashSet<>();
            for (String a : input) {
                if (!uniqueList.add(a)) {
                    duplicatesList.add(a);
                }
            }
            return duplicatesList;
        }


        // Мапы


    /*1. Дана Map<String, String> map, написать функцию, которая вернет Мап, такую,
    если в есходной map есть ключ ‘a’ и ‘b’,
    то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
    Примеры:
    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}*/


        public Map<String, String> modifyMaps (Map < String, String > map){
            Map<String, String> modifyMap = new LinkedHashMap<>();
            if (map.containsKey("a")) {
                modifyMap.put("a", map.get("a"));
            }
            if (map.containsKey("a") && map.containsKey("b")) {
                modifyMap.put("ab", map.get("a") + map.get("b"));
            }
            if (map.containsKey("b")) {
                modifyMap.put("b", map.get("b"));
            }
            return modifyMap;
        }



/*2. Дан массив букв, вернуть мапу Map<String, Boolean> где каждая строка является ключем, а значением true, если строка в массиве больше одного раза и false, если только один раз.

    Примеры:

    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */


        public static Map<String, Boolean> wordMultiple(String[] arr){
            Map<String, Boolean> ret = new HashMap<>();
            for (String s : arr) {
                ret.computeIfPresent(s, (key, value) -> true);
                ret.putIfAbsent(s, false);
            }
            return ret;
        }


/*3. Анаграмма слова x  - слово, по длине равное x и состоящее из таких же букв, что и x.
Например, слово “vani” является анаграммой слова “ivan”, а слова “naan” и “anan” являются анаграммами слова “anna”.
Дан словарь, сожержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
Например, по слову “ivan” функция вернет {“navi”, “vani”}*/

        public static class Anagram {
            public List<String> anagram(List<String> list, String string) {
                Map<String, List<String>> anagramMap = new HashMap<>();
                List<String> value = new ArrayList<>();
                if (list.contains(string)) {
                    anagramMap.put(string, value);
                }
                return value;
            }
        }


/*4. Дан список имен, где некоторые имена повторяются.
 Написать функцию, которая по имени вернет количество вхождений этого имени в список.  */
public static class nameCount {
    public Map<String, Integer> nameCount(List<String> list, String str) {
        Map<String, Integer> ret = new HashMap<>();
        for (String s : list) {
            if (str.equals(s)) {
                if (ret.containsKey(s)) {
                    ret.put(s, ret.get(s) + 1);
                } else {
                    ret.put(s, 1);
                }
            }
        }
        return ret;
    }
}


/*5. Дан текст, подсчитать, какое слово встречается больше остальных. Слова в предложениях могут разделяться запятыми, точками, пробелами.
Предлоги [в, на, из, под] и остальные не учитывать при подсчете.
 */


        public static class MaxWordCount {
            public MaxWordCount(String str) {
            }

            public Map<String, Integer> maxWordCount(String str) {
                List<String> listSplit = new LinkedList<>(Arrays.asList(str.split("\\s*(\\s|,|!|\\.)\\s*")));
                Map<String, Integer> ret = new HashMap<>();
                for (String s : listSplit) {
                    if (s.length() > 3) {
                        if (ret.containsKey(s)) {
                            ret.put(s, ret.get(s) + 1);
                        } else {
                            ret.put(s, 1);
                        }
                    }
                }

                Map.Entry me = Collections.max(ret.entrySet(), (es1, es2) -> es1.getValue() - es2.getValue());
                ret.clear();
                ret.put((String) me.getKey(), (Integer) me.getValue());
                return ret;
            }
        }
        
}
