import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", 45, new Address("a", 1));
        Person p2 = new Person("Maria", 14, new Address("b", 2));
        Person p3 = new Person("Stepan", 34, new Address("c", 3));
        Person p4 = new Person("Oleg", 24, new Address("d", 4));
        Person p5 = new Person("Oleg", 25, new Address("e", 5));
        Person p6 = new Person("Artur", 45, new Address("f", 6));

        List<Person> persons = new ArrayList<>();
        Collections.addAll(persons, p1, p2, p3, p4, p5, p6);

        BankAccount ba1 = new BankAccount("AABBCC111", p1);
        BankAccount ba2 = new BankAccount("FFGGHH222", p1);
        BankAccount ba3 = new BankAccount("LLMMNN333", p3);
        BankAccount ba4 = new BankAccount("QQRRSS444", p1);
        BankAccount ba5 = new BankAccount("WWXXZZ555", p4);

        List<BankAccount> accounts = new ArrayList<>();
        Collections.addAll(accounts, ba1, ba2, ba3, ba4, ba5);

        Person p7 = new Person("Ivan", 45, new Address("Baker", 3), Arrays.asList(ba1, ba2, ba4));
        Person p8 = new Person("Stepan", 34, new Address("Carnaby", 1), Arrays.asList(ba3));

        List<Person> listOfPerson = new ArrayList<>();
        Collections.addAll(listOfPerson, p7, p8);

        List<Address> addressesPersonsOlder17 = getAddressesPersonsOlder17(persons);
        System.out.println(addressesPersonsOlder17.toString());

        List<String> distinctNames = getDistinctNames(persons);
        System.out.println(distinctNames.toString());

        Map<Integer, List<Person>> mapAgePersons = partionPersonsByAge(persons);
        System.out.println(mapAgePersons.toString());

        Map<Person, List<BankAccount>> mapPersonBankAccount = partionBankAccount(accounts);
        for (Map.Entry entry : mapPersonBankAccount.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        List<String> ibanns = getIBANNs(accounts);
        System.out.println(ibanns.toString());

        String sentence = "dhgfj sdhfg ss ght ww vaa vdvd";
        System.out.println(countOfWords(sentence, "h"));

        String string = "2.4";
        System.out.println(isDigit(string));

        List<String> ibannsByPerson = getIBANNsByPerson(listOfPerson);
        System.out.println(ibannsByPerson.toString());

    }

    // Нужно написать функцию, которая по списку persons вернет список адресов тех людей, чей возраст больше 17 лет.
    public static List<Address> getAddressesPersonsOlder17(List<Person> persons) {
        return persons
                .stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
                .collect(Collectors.toList());
    }

    //2. Есть список имен, нужно написать функцию, которая вернет список имен без дупликатов
    public static List<String> getDistinctNames(List<Person> persons) {
        return persons
                .stream()
                .map(Person::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    //3. Есть список людей, нужно написать функцию, которая вернет мапу, где ключом является возраст, а значением список людей этого возраста.
    public static Map<Integer, List<Person>> partionPersonsByAge(List<Person> persons) {
        return persons
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }

    //нужно написать функцию, которая возвращает мапу, где значением является Person, а значением - список его банковских счетов.
    public static Map<Person, List<BankAccount>> partionBankAccount(List<BankAccount> accounts) {
        return accounts
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getOwner));
    }

    //5. Написать функцию, которая для списка счетов, возвращает список IBANNs, где в каждом IBANN символы после 3-го и до конца заменены звездочками.
    public static List<String> getIBANNs(List<BankAccount> accounts) {
        return accounts
                .stream()
                .map(BankAccount::getIBANN)
                .map(p -> p.substring(0, 3) + p.substring(3).replaceAll("\\w", "*"))
                .collect(Collectors.toList());
    }

    //6. Написать функцию, которая принимает предложение, а возвращает количество слов, начинающихся на заданную букву.
    public static long countOfWords(String sentence, String s) {
        List<String> strings = Arrays.asList(sentence.split(" "));
        return strings
                .stream()
                .filter(p -> p.substring(0, 1).equals(s))
                .count();
    }

    //7. Написать функцию, которая проверяет, является ли заданная строка целым числом. Подсказка - Character.isDigit() и Stream.allMatch().
    public static boolean isDigit(String string) {
        return string
                .chars()
                .allMatch(Character::isDigit);
    }

    //9. Написать функцию, которая по списку persons возвращает список их банковских счетов с звездочками с третьего символа. Подсказка - flatMap()
    public static List<String> getIBANNsByPerson(List<Person> persons) {
        return persons
                .stream()
                .flatMap(p -> p.getBankAccounts().stream())
                .map(BankAccount::getIBANN)
                .map(p -> p.substring(0, 3) + p.substring(3).replaceAll("\\w", "*"))
                .collect(Collectors.toList());
    }

    //10. Для списка persons посчитать общий возраст тех, кому больше 17 лет. Подсказка - reduce()
    public static int generalAgeOver17(List<Person> list) {
        return list.stream().filter(p -> p.getAge() >= 17).map(Person::getAge).reduce((a, b) -> a + b).orElse(0);
    }

    //11. Написать функцию, которая для списка persons напечатает для тех, кто старше 17 лет:
    // In Germany <name1> and <name2> and …<nameN> are of legal age. Подсказка - Collectors.joining();
    public static void printGeneralAgeOver17(List<Person> list) {
        String ret = list.stream()
                .filter(p -> p.getAge() >= 17)
                .map(Person::getName)
                .collect(Collectors.joining(" and "));
        System.out.println("In Germany " + ret + " are of legal age.");
    }
}

