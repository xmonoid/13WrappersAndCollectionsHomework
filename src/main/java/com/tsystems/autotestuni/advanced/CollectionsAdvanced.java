package com.tsystems.autotestuni.advanced;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class CollectionsAdvanced {

    /**
     * Write a method which counts the number of each word in a passed text.
     * Words should be returned in the same order in which they appeared in the text for the first time.
     * The final map should contain words in upper case only.
     *
     * "We will we will rock you! We will we will rock you!" -> ["WE":4, "WILL":4, "ROCK": 2, "YOU":2]
     *
     * @param text a random text
     * @return a map with pairs ["word":"count"]
     */
    public static Map<String, Integer> howManyWordsInText(String text) {
        Map<String, Integer> result = new LinkedHashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(text, " ,.!?\n");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toUpperCase();
            if (result.containsKey(word)) {
                Integer count = result.get(word);
                result.put(word, ++count);
            } else {
                result.put(word, 1);
            }
        }

        return result;
    }


    /**
     * We have a set of employees as an input.
     * We need to enqueued them according to either their hiring date or their birthdate.
     *
     * Hints:
     * 1. Use {@link PriorityQueue}.
     * 2. You have to create an instance of {@link Comparator} interface and use it to compare two employees.
     *
     * @param employees a set of employees in random order
     * @param byHiringDate if set to {@code true}, the employees should be ordered by their hiring date,
     *                    and by their birthdate otherwise
     * @return a {@link Queue} of the employees
     */
    public static Queue<Employee> enqueueEmployees(Set<Employee> employees, boolean byHiringDate) {
        Comparator<Employee> comparator = byHiringDate ?
                Comparator.comparing(Employee::getHiringDate) :
                Comparator.comparing(Employee::getBirthdate);

        Queue<Employee> result = new PriorityQueue<>(comparator);

        result.addAll(employees);

        return result;
    }

    public static class Employee {

        private final LocalDate birthdate;
        private final LocalDate hiringDate;
        private final String name;

        public Employee(LocalDate birthdate, LocalDate hiringDate, String name) {
            this.birthdate = birthdate;
            this.hiringDate = hiringDate;
            this.name = name;
        }

        public LocalDate getBirthdate() {
            return birthdate;
        }

        public LocalDate getHiringDate() {
            return hiringDate;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name +
                    ", birthdate=" + birthdate +
                    ", hiringDate=" + hiringDate + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(birthdate, employee.birthdate) && Objects.equals(hiringDate, employee.hiringDate) && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(birthdate, hiringDate, name);
        }
    }
}
