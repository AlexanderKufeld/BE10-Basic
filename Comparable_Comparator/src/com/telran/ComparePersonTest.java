package com.telran;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparePersonTest {
    @Test
    public void testPerson() {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person("Kolya", "a", 11);
        Person p2 = new Person("Alex", "b", 22);
        Person p3 = new Person("Sandra", "c", 33);
        Person p4 = new Person("Ida", "d", 44);

        Collections.addAll(persons, p1, p2, p3, p4);

        List<Person> exp = new ArrayList<>();
        Collections.addAll(exp, p2, p4, p1, p3);

        List<Person> akt = Main.comparePersonsByFirstName(persons);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testPerson1() {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person("Kolya", "a", 11);
        Person p2 = new Person("Alex", "d", 22);
        Person p3 = new Person("Sandra", "c", 33);
        Person p4 = new Person("Ida", "b", 44);

        Collections.addAll(persons, p1, p2, p3, p4);

        List<Person> exp = new ArrayList<>();
        Collections.addAll(exp, p1, p4, p3, p2);

        List<Person> akt = Main.comparePersonsByLastName(persons);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testPerson2() {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person("Kolya", "a", 25);
        Person p2 = new Person("Alex", "b", 18);
        Person p3 = new Person("Sandra", "c", 42);
        Person p4 = new Person("Ida", "d", 31);

        Collections.addAll(persons, p1, p2, p3, p4);

        List<Person> exp = new ArrayList<>();
        Collections.addAll(exp, p2, p1, p4, p3);

        List<Person> akt = Main.comparePersonsByAge(persons);

        Assert.assertEquals(exp, akt);
    }
}

