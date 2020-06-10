import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {

    //Есть два класса
    // Нужно написать функцию, которая по списку persons вернет список адресов тех
    // людей, чей возраст больше 17 лет.

    public class Person {
        String name;
        int Age;
        Address address;
    }
    public class Address {
        String street;
        int houseNumber;
    }

    List<Person> persons = Arrays.asList();

    Map <Person,Address> res = persons.stream()
            .filter((person)-> persons > 17)
            .collect(Collectors.toMap((p) -> p.getName(), (p) -> p.getAddress()));




/*Есть список имен, нужно написать функцию, которая вернет список имен без
    дупликатов.*/


/* Есть список людей, нужно написать функцию, которая вернет мапу, где
    ключом является возраст, а значением список людей этого возраста.*/



//Есть два класса:
//  нужно написать функцию, которая возвращает мапу, где значением является Person, а
//    значением - список его банковских счетов.

    public class BankAccount {
        String IBANN;
        Person owner;
    }
    public class Person {
        String name;
    }


    /*Написать функцию, которая для списка счетов, возвращает список IBANNs,
    где в каждом IBANN символы после 3-го и до конца заменены звездочками.*/


    /*Написать функцию, которая принимает предложение, а возвращает
    количество слов, начинающихся на заданную букву.*/


/*Написать функцию, которая проверяет, является ли заданная строка целым
    числом. Подсказка - Character.isDigit() и Stream.allMatch().*/



//Есть два класса:

    public class BankAccount {
        String IBANN;
    }
    public static class Person {
        String name;
        List<String> banAccounts;

    }

// Написать функцию, которая по списку persons возвращает список их  банковских счетов с звездочками с третьего символа. Подсказка - flatMap()



// Для списка persons посчитать общий возраст тех, кому больше 17 лет. Подсказка - reduce()



/* Написать функцию, которая для списка persons напечатает для тех, кто старше 17 лет:
In Germany <name1> and <name2> and ...<nameN> are of legal age. Подсказка - Collectors.joining();*/





}
