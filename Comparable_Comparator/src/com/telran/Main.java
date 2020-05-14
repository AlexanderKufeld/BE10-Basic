package com.telran;

import java.util.Collections;
import java.util.List;

public class Main {

        public static void main(String[] args) {

        }

        public static List<Person> comparePersonsByFirstName(List<Person> persons) {
            Collections.sort(persons);
            return persons;
        }

        public static List<Person> comparePersonsByLastName(List<Person> persons) {
            Collections.sort(persons, new CompareByLastName());
            return persons;
        }

        public static List<Person> comparePersonsByAge(List<Person> persons) {
            Collections.sort(persons, new CompareByAgeComparator());
            return persons;
        }
    }


