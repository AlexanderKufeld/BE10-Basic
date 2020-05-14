package com.telran;

public class Person implements Comparable<Person> {

        private String firstName;
        private String lastName;
        private int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person p) {

            return (this.firstName.compareTo(p.firstName));
        }

        @Override
        public String toString() {
            return "Person " + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '.';
        }
    }

