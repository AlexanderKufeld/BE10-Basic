import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Files_With_Stream_Test {


   /*   Ivan;Petrov;25
        Piotr;Ivanov;40
        Anna;Petrova;34
        Sergey;Lukichev;40 */

    public class FilesStreamTest {
        Person p1 = new Person("Ivan", "Petrov", 25);
        Person p2 = new Person("Piotr", "Ivanov", 40);
        Person p3 = new Person("Anna", "Petrova", 34);
        Person p4 = new Person("Sergey", "Lukichev", 40);


        @Test
        public void testCreateListPerson() throws IOException {

            File f = new File("Persons.csv");
            List<Person> actual = Files_With_Stream.createArrayFromFile();

            List<Person> expected = new ArrayList<>();
            expected.add(p1);
            expected.add(p2);
            expected.add(p3);
            expected.add(p4);
            assertEquals(expected.size(), actual.size());

        }

    }
}
