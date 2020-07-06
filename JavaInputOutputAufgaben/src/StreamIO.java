
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StreamIO {
    public static void main(String[] args) throws Exception {

        String file = "sum.txt";

        String[] strArr = {"aaa", "bbbb", "a", "bb"};
        String file2 = "persons.csv";
        readListPerson(file2);

        String file3 = "customers.csv";
        List<Customers> customers = new ArrayList<>();
        Collections.addAll(customers,
                new Customers("A", "AA", 18),
                new Customers("B", "BB", 20),
                new Customers("C", "CC", 53));
        customersToFile(customers, file3);

    }


    /*
1. Есть текстовый файл, где каждая строка - целое число:
1
2
5
45
54 => 107
Написать функцию, которая принимает имя файла, возвращает сумму чисел из файла.
Подсказка: FileReader, BufferedReader плюс stream API.
 */
    public static int sumFromFile1(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return br.lines().mapToInt(Integer::parseInt).sum();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int sumFromFile2(String file) {
        try {
            return Files.lines(Paths.get(file)).mapToInt(Integer::parseInt).sum();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }


    /*
    2. Есть массив строк разной длины. Отсортировать его по длине строк. Пример:
вход {“aaa”, “bbbb”, “a”, ‘bb”} , выход {“a”, “bbb”, “aaa”, “bbbb”} . Подсказка:
Stream API, sorted, Comparator, lambda functions, Java Doc.
     */

    public static String[] sortedStringArray(String[] input) {
        Arrays.sort(input, Comparator.comparing(String::length));
        return input;
    }


/*
3. Есть текстовый csv файл:
“Ivan”, “18”
“Piotr”, “20”
“Anna”, “10”
Вывести на экран отсортированный по возрасту список. Подсказка: вычитать файл
построчно с помощью Reader’a, положить данные в список классов Person, список
отсортировать с помощью Stream API.
Можно усложнить - вычитать только тех, кто старше 17 лет. Тут разные варианты
решения: вычитать всех, потом отсортировать тех, кто старше 17, но если список в
файле большой, то может не стоит создавать объекты в Джаве, то есть проверять в
процессе чтения и создавать Джава объекты только для тех пользователей, что
старше 17.
 */

    public static void readListPerson(String file) {
        String str = null;
        String[] person = null;
        List<Personen> listPersonen = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((str = br.readLine()) != null) {
                person = str.replace("\"", "").split(",");
                listPersonen.add(new Personen(person[0], Integer.parseInt(person[1])));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        listPersonen.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .forEach(System.out::println);

        listPersonen.stream().filter(i -> i.getAge() > 17)
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .forEach(System.out::println);
    }


    /*
    4. Ну и обратная задачка: есть список Customers: firstName, lastName, age -
сохранить его в csv файл, похожий на то, что в 3.
     */

    public static void customersToFile(List<Customers> customers, String file3) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file3))) {
            for (Customers c : customers) {
                bw.write(c.getFirstName() + "," + c.getLastName()
                        + "," + c.getAge() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (!file3.isEmpty()) {
            System.out.println("File created");
        }
    }
}