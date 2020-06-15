
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;

/*
   Given a text file people.csv:

   Ivan;Petrov;25
   Piotr;Ivanov;40
   Anna;Petrova;34
   Sergey;Lukichev;40
   print all persons as java objects
   Implement a function, which returns info about an oldest/youngest person
   Implement a function, which returns a list of persons of a similar age (List<Person> getPeopleByAge(int age))
    */

public class Files_With_Stream{

    public static void main(String[] args) throws IOException {
        System.out.println(createArrayFromFile());
        System.out.println(createArrayFromFile().get(1));
        System.out.println("Youngest: " + youngestPerson(createArrayFromFile()));
        System.out.println("Oldest: " + oldestPerson(createArrayFromFile()));
        System.out.println("Person of similiar age: " + getPeopleByAge(40));
    }

    public static Person youngestPerson (List<Person> persons) throws IOException {
        return createArrayFromFile().stream().min(comparing(Person::getAge)).orElseThrow();
    }
    public static Person oldestPerson (List<Person> persons) throws IOException {
        return createArrayFromFile().stream().max(comparing(Person::getAge)).orElseThrow();
    }

    public static List<Person> getPeopleByAge(int age) throws IOException {
        return createArrayFromFile().stream().filter(p -> p.getAge() == age).collect(Collectors.toList());
    }

    public static List<Person> createArrayFromFile() throws IOException {
        File people = new File("src\\Persons.csv");
        Scanner scanner = new Scanner(people);
        List<Person> persons = new ArrayList<>();
        while(scanner.hasNextLine()){
            String data[]=scanner.nextLine().split(";");
            persons.add(new Person(data[0],data[1],Integer.parseInt(data[2])));
        }
        scanner.close();
        return persons;
    }

}
